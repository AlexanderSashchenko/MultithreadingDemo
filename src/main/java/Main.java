public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter(0, 100);
        ThreadFromRunnable threadFromRunnable = new ThreadFromRunnable("Runnable", counter);
        ThreadFromThread threadFromThread = new ThreadFromThread("Thread", counter);
        threadFromRunnable.start();
        threadFromThread.start();
    }
}
