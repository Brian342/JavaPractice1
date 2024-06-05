public class multithreadding {
    public static void main(String[] args) throws InterruptedException {
        /* multithreading = process of executing multiple threads simultaneously
                            helps maximum utilization of cpu
                            Threads are independent, they don't affect the execution of other threads
                            An exception in one thread will not interrupt other threads
                            useful for serving multiple clients, multiplayer games, or other mually independent tasks
         * 
         */
        // Create a subclass of Thread
        mymultithreadding thread1 = new mymultithreadding();

        //implements Runnable interface and pass instance as an argument to Thread()
        mymultithreadingrunnable runnable1 = new mymultithreadingrunnable();
        Thread thread2 = new Thread(runnable1);

        // thread1.setDaemon(true);
        // thread2.setDaemon(true);

        thread1.start();
        // thread1.join(3000); //calling thread (ex.main) wait untill the specified thread dies of for x milliseconds
        thread2.start();

        System.out.println(1/0);

    }
}
