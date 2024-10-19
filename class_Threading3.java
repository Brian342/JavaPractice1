public class class_Threading3 implements Runnable{
        //Prints 10 Alphabets starting from 'a'
        Thread t;
        class_Threading3(){
            t = new Thread(this);
        class_Threading3 CT3 = new class_Threading3();
        Thread t1 = new Thread(CT3);
        t.start();
        }
    public void run() {
        System.out.println("Print alphabets starting from 'a");
    //Prints 10 Alphabets starting from 'a'
    while (!Thread.interrupted()) {
        for(char i = 'a'; i < 'a' + 10; i++){
            System.out.println(i);    
        }
    }
    System.out.println("Thread has Stopped");

    }
    }
    public static void main(String[] args) throws InterruptedException{

    }
