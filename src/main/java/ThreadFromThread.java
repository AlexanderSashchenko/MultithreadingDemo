public class ThreadFromThread extends Thread {

    private Thread thread;
    private String threadName;
    private Counter counter;

    public ThreadFromThread(String threadName, Counter counter) {
        this.threadName = threadName;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(threadName + " runs:");
        while (counter.getInitialValue() <= counter.getEndValue()) {
            System.out.println(threadName + " " + counter.getInitialValue());
            counter.increment();
        }
    }

    public void start() {
        System.out.println("Starting " +  threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
