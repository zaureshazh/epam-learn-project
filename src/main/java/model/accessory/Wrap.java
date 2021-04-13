package model.accessory;

import enums.WrapType;

public class Wrap extends Accessory {
    private WrapType wrapType;

    public Wrap(String name, int price, WrapType wrapType) {
        super(name, price);
        this.wrapType = wrapType;
    }

    public WrapType getWrapType() {
        return wrapType;
    }

    public void setWrapType(WrapType wrapType) {
        this.wrapType = wrapType;
    }

    @Override
    public String toString() {
        return "Wrap: " + getName() +
                "(type: " + wrapType.getName() +
                ", price: " + getPrice() + ')';
    }
}
