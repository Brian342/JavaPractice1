public class Class_ThreadingUsingSleep implements Runnable{
    public static void main(String[] args) {
        Class_ThreadingUsingSleep sl = new Class_ThreadingUsingSleep();
        Thread t1 = new Thread(sl);
        t1.start();
    }
    public void run(){
        System.out.println("This are the odd numbers");
        for(char i = 'a'; i < 'a' + 10; i++){
            System.out.println(i);    
        }
    }
    }

