package model.accessory;

public class Tape extends Accessory {
    private int length;

    public Tape(String name, int price, int length) {
        super(name, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Tape: " + getName() +
                "(length: " + length +
                ", price: " + getPrice() + ")";
    }
}
