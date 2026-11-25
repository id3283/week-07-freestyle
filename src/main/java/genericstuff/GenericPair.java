package genericstuff;

public class GenericPair<T> {

    // A pair contains two integers
    private T leftNumber;
    private T rightNumber;
    private String name;

    public GenericPair(T leftNumber, T rightNumber, String name) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.name = name;
    }

    public T getLeftNumber() {
        return this.leftNumber;
    }

    public T getRightNumber() {
        return this.rightNumber;
    }

    public void swap() {
        T temp = leftNumber;
        leftNumber = rightNumber;
        rightNumber = temp;
    }
}