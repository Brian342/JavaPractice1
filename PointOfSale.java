import java.util.Scanner; /*imports necessary java classes for input handling and using dynamic arrays */
import java.util.ArrayList; 
import java.util.List;

public class PointOfSale { // class name point of sale
    @SuppressWarnings({ "resource", "unused" }) // suppress compiler warnings 
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //creates a new scanner object named cin which is used to read input.

       List <Items> items = new ArrayList<>(); //declares a new arraylist named items which will hold objects of the items class
        items.add(new Items("milk", 50.0)); 
        items.add(new Items("Sugar", 3.0));
        items.add(new Items("Eggs", 15.0));//populate the items list with instances of the Items class representing different items for sale along with their prices
        items.add(new Items("Bread", 60.0));
        items.add(new Items("Omo", 99.0));
        items.add(new Items("Pens", 10.0));

        
        System.out.println("Welcome to Uhunye shop ");
        System.out.println("Items Available");
        for(int i=0; i<items.size(); i++){
            System.out.printf("%d. %s (%.2f)%n", i+1, items.get(i).getName(), items.get(i).getPrice());
        } // prints the available items for purchase along with their index price
        System.out.print("Enter the numbers of the items you want to purchase, separated by space: eg(1 2 3) ");
        String[] input = cin.nextLine().split("\\s+"); // reads the inputline and splits it into an array of strings based on whitespace
        //converts the input string to integer and subtracts 1 from each value(to adjust for zero-based indexing), stores them in an array named 'selectedItems'
        int[] selectedItems = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            selectedItems[i] = Integer.parseInt(input[i]) - 1;
}
double cost = calculatecost(items, selectedItems); // calculates the total cost of the selected items using calculatecost method
System.out.printf("The total cost of the selected items is: ksh%.2f%n", cost);

updateinventory(items, selectedItems); //updates the inventory of items by reducing the quality of selected items using the updatedinventory method

System.out.println("Updated Inventory: ");
for (int i =0; i<items.size(); i++){
    System.out.printf("%s: %d%n", items.get(i).getName(), items.get(i).getQuantity());
}
}
public static double calculatecost(List<Items> items, int[] selectedItems) { //method that calculate the total cost of selected items based on their prices
    double cost = 0.0;
    for (int i = 0; i < selectedItems.length; i++) {
        int selectedItem = selectedItems[i];
        if (selectedItem >= 0 && selectedItem < items.size()) {
            cost += items.get(selectedItem).getPrice();
        }
    }
    return cost;
}
public static void updateinventory(List<Items> items, int[] selectedItems) { //declared a method named updateinventory that updates the inventory by reducing the quality of selected items by 1
    for (int i = 0; i < selectedItems.length; i++) {
        int selectedItem = selectedItems[i];
        if (selectedItem >= 0 && selectedItem < items.size()) {
            items.get(selectedItem).setQuantity(items.get(selectedItem).getQuantity() - 1);
        }
    }
}

}
