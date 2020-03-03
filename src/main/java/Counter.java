public class Counter {

    private int initialValue;
    private int endValue;

    public Counter(int initialValue, int endValue) {
        this.initialValue = initialValue;
        this.endValue = endValue;
    }

    public void increment() {
        this.initialValue++;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public int getEndValue() {
        return endValue;
    }
}
