public class lambdaRunnable {
    public static void main(String args[]){
        Runnable runnable = ()->(for(int i=0; i<20; i+=2))
        System.out.println(i);
    };
            Thread th = new Thread(runnable);
            th.start();
}
