package model.flower;

import java.time.LocalDate;

public class Rose extends Flower {
    private String roseType;

    public Rose(String name, int stemLength, int price, LocalDate arrivalDate, String roseType) {
        super(name, stemLength, price, arrivalDate);
        this.roseType = roseType;
    }

    public String getRoseType() {
        return roseType;
    }

    public void setRoseType(String roseType) {
        this.roseType = roseType;
    }

    @Override
    public String toString() {
        return getName() + "(Rose, " +
                "type: " + roseType +
                ", stem length: " + getStemLength() +
                ", price: " + getPrice() + ")";
    }
}
