public class Class_Treading implements Runnable{
    /*Create and run three threads
     * The first thread prints odd numbers between 1 and 20
     */
        public static void main(String[] args)throws InterruptedException {
            Class_Treading CT = new Class_Treading();
            Thread t1 = new Thread(CT);
            t1.start();
          
            }
        
        public void run() {
            System.out.println("This are the odd numbers");
            for(int i=0; i <= 20; i++ ){
                if (i % 2 != 0){
                    System.out.println(i);
                }
        }
    }
}
