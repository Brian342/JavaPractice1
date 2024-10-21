public class sqlConnector {
    
    public static void main(String[] args) {
        
    }
   void connector(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (Exception e) {
        // TODO: handle exception
    }
   }
}
