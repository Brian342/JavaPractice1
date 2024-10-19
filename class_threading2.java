public class class_threading2 implements Runnable{

    public static void main (String args[]){
        class_threading2 ct1 = new class_threading2();
         Thread t1 = new Thread(ct1);
         t1.start();
    }
    public void run(){
    //This thread prints even numbers between 20 and 40
    System.out.println("This are the even numbers between 20  and 40 " );
    for(int i = 20; i <= 40; i++){
        if (i % 2 ==0) {
            System.out.println(i);;
        }
    }
    }
}
