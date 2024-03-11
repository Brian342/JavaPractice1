public class AnnonymousRunnable {    
public static void main(String args[]){
    Runnable runnable = new Runnable(){public void run(){
    for(int i=0; i<5;i++)
    System.out.println(i);
}};
Thread th = new Thread(runnable);
th.start();
}
}


