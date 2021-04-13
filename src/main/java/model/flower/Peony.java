package model.flower;

import java.time.LocalDate;

public class Peony extends Flower {
    private String peonyType;

    public Peony(String name, int stemLength, int price, LocalDate arrivalDate, String peonyType) {
        super(name, stemLength, price, arrivalDate);
        this.peonyType = peonyType;
    }

    public String getPeonyType() {
        return peonyType;
    }

    public void setPeonyType(String peonyType) {
        this.peonyType = peonyType;
    }

    @Override
    public String toString() {
        return getName() + "(Peony, " +
                "type: " + peonyType +
                ", stem length: " + getStemLength() +
                ", price: " + getPrice() + ")";
    }
}
