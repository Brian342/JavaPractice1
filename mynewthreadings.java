public class mynewthreadings extends Thread{

    @Override
    public void run() {
        if(this.isDaemon()){
            System.out.println("This is a daemon thread that is running");
        }
        else {
            System.out.println("This is a user thread running");
        }
    }

    

}
