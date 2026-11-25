package genericstuff;

class Pair<T> {
    // A pair contains two objects
    private T leftThing;
    private T rightThing;

    Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public T getLeftThing() {
        return this.leftThing;
    }

    public T getRightThing() {
        return this.rightThing;
    }

    public void swap() {
        T temp = leftThing;
        leftThing = rightThing;
        rightThing = temp;
    }
}