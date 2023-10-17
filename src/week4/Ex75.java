package week4;

public class Ex75 {
    private int value;
    private int initialValue;

    public Ex75(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;

    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }

    }
}
