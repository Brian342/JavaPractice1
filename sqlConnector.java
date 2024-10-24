// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;
// public class sqlConnector {
    
//     public static void main(String[] args) {
//         sqlConnector pro = new sqlConnector();
//         pro.createconnector();
//     }
//    void createconnector(){
//     try {
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection con = DriverManager.getConnection("", "SA", "<YourStrong@Passw0rd>");
//         // Statement stmt = con.createStatement();
//         // ResultSet rs = stmt.executeQuery("pass");
//         // while (rs.next()) {
//         //     String name = rs.getString("");
//         //     System.out.println();
//         // }
//         System.out.println("Connected");
//     } catch (ClassNotFoundException ex) {
//         Logger.getLogger(sqlConnector.class.getName()).log(Level.SEVERE, null, ex);
//         // TODO: handle exception
//     } catch (SQLException ex){
//         Logger.getLogger(sqlConnector.class.getName()).log(Level.SEVERE, null, ex);
//     }
//    }
// }