public class threadings {
    public static void main(String[] args) throws InterruptedException {
            /*
         * Thread = A thread of execution in a program (kind of like a virtual CPU)
         *          The JVM allows an application to have multiple threads running concurrently
         *          Each thread can execute parts of your code in parallel with the main thread
         *          Each thread has a priority.
         *          Threads with higher priority are executed in preference compared to threads with a lower priority
         * 
         *          The java virtual machine continues to execute threads unitil either of the following occurs
         *              1. The exit method of a class Runtime has been called
         *              2. All user threads have died
         * 
         *          When a JVM starts up, there is a thread which calls the main method
         *          This thread is called "main"
         * 
         */

        //  System.out.println(Thread.activeCount());
        // Thread.currentThread().setName("Mainnnnn"); // change the name of a thread
        //  System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10);// changing priority
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive()); // checking if thread is active

    //     for(int i =3;i>0;i--){
    //         System.out.println(i);
    //         Thread.sleep(1000);
    //     }
    //     System.out.println("You are done");

    // }

    
}
