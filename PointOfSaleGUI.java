import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PointOfSaleGUI extends JFrame {
    private List<Items> items;
    private JTextArea availableItemsTextArea;
    private JTextArea updatedInventoryTextArea;
    private JTextField inputTextField;

    public PointOfSaleGUI() {
        items = new ArrayList<>();//declares a new arraylist named items which will hold objects of the items class
        items.add(new Items("milk", 50.0, 10));
        items.add(new Items("Sugar", 3.0, 10));
        items.add(new Items("Eggs", 15.0, 10));
        items.add(new Items("Bread", 60.0, 10));//populate the items list with instances of the Items class representing different items for sale along with their prices, and quantity
        items.add(new Items("Omo", 99.0, 10));
        items.add(new Items("Pens", 10.0, 10));

        setTitle("Uhunye Shop - Point of Sale Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Shop name panel
        JPanel shopNamePanel = new JPanel();
        JLabel shopNameLabel = new JLabel("Uhunye Shop");
        shopNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        shopNamePanel.add(shopNameLabel);
        shopNamePanel.setBackground(new Color(255, 215, 0)); // Yellow background

        // Available items panel
        JPanel itemsPanel = new JPanel();
        itemsPanel.setLayout(new BorderLayout());
        availableItemsTextArea = new JTextArea(15, 30);
        availableItemsTextArea.setEditable(false);
        availableItemsTextArea.setBackground(new Color(255, 250, 205)); // Beige background
        itemsPanel.add(new JScrollPane(availableItemsTextArea), BorderLayout.CENTER);

        // Purchase panel
        JPanel purchasePanel = new JPanel();
        purchasePanel.setLayout(new FlowLayout());
        JLabel selectLabel = new JLabel("Select items to purchase (e.g., 1 2 3): ");
        inputTextField = new JTextField(15);
        JButton purchaseButton = new JButton("Purchase");
        purchaseButton.addActionListener(new ActionListener() { //purchasebutton action listener
            @Override
            public void actionPerformed(ActionEvent e) {
                performPurchase();
            }
        });
        purchasePanel.add(selectLabel);
        purchasePanel.add(inputTextField);
        purchasePanel.add(purchaseButton);

        // Output panel
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        updatedInventoryTextArea = new JTextArea(15, 30);
        updatedInventoryTextArea.setEditable(false);
        updatedInventoryTextArea.setBackground(new Color(240, 255, 240)); // Honeydew background
        outputPanel.add(new JScrollPane(updatedInventoryTextArea), BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeApplication();
            }
        });
        JButton reloadButton = new JButton("Reload Inventory");
        reloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reloadInventory();
            }
        });
        buttonPanel.add(closeButton);
        buttonPanel.add(reloadButton);

        // Add components to the frame
        add(shopNamePanel, BorderLayout.NORTH);
        add(itemsPanel, BorderLayout.WEST);
        add(purchasePanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        displayAvailableItems();
    }

    private void displayAvailableItems() {
        availableItemsTextArea.append("Items Available:\n");
        for (int i = 0; i < items.size(); i++) {
            Items item = items.get(i);
            availableItemsTextArea.append((i + 1) + ". " + item.getName() + " (ksh" + item.getPrice() + ")\n");
        }
    }

    private void performPurchase() {
        String input = inputTextField.getText().trim();
        String[] selectedItemsStr = input.split("\\s+");
        List<Integer> selectedItemsList = new ArrayList<>();
        List<Integer> outOfIndexItems = new ArrayList<>();
        for (String selectedItem : selectedItemsStr) {
            try {
                int itemIndex = Integer.parseInt(selectedItem) - 1;
                if (itemIndex >= 0 && itemIndex < items.size()) {
                    selectedItemsList.add(itemIndex);
                } else {
                    outOfIndexItems.add(Integer.parseInt(selectedItem)); // Add out of index item
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid item selection. Please enter valid item numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    
        if (!outOfIndexItems.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder("Item(s) out of index: ");
            for (int item : outOfIndexItems) {
                errorMessage.append(item).append(", ");
            }
            errorMessage.delete(errorMessage.length() - 2, errorMessage.length()); // Remove the last comma and space
            errorMessage.append(". Please enter valid item numbers.");
            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        int[] selectedItems = selectedItemsList.stream().mapToInt(i -> i).toArray();
        double cost = calculateCost(selectedItems);
        updateInventory(selectedItems);
    
        updatedInventoryTextArea.append("The total cost of the selected items is: ksh" + String.format("%.2f", cost) + "\n\n");
        updatedInventoryTextArea.append("Updated Inventory:\n");
        for (Items item : items) {
            updatedInventoryTextArea.append(item.getName() + ": " + item.getQuantity() + "\n");
        }
    
        inputTextField.setText(""); // Clear the input text field
    }
    
    

    private double calculateCost(int[] selectedItems) {
        double cost = 0.0;
        for (int selectedItem : selectedItems) {
            cost += items.get(selectedItem).getPrice();
        }
        return cost;
    }

    private void updateInventory(int[] selectedItems) {
        for (int selectedItem : selectedItems) {
            items.get(selectedItem).setQuantity(items.get(selectedItem).getQuantity() - 1);
        }
    }

    private void closeApplication() {
        dispose(); // Close the application
    }

    private void reloadInventory() {
        // Reload inventory back to default
        for (Items item : items) {
            item.setQuantity(10);
        }
        updatedInventoryTextArea.setText(""); // Clear the updated inventory text area
        updatedInventoryTextArea.append("Inventory reloaded back to default.\n\n");
        updatedInventoryTextArea.append("Updated Inventory:\n");
        for (Items item : items) {
            updatedInventoryTextArea.append(item.getName() + ": " + item.getQuantity() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PointOfSaleGUI gui = new PointOfSaleGUI();
                gui.setVisible(true);
            }
        });
    }
}
