package model.flower;

import enums.TulipCountry;

import java.time.LocalDate;

public class Tulip extends Flower {

    TulipCountry tulipCountry;

    public Tulip(String name, int stemLength, int price, LocalDate arrivalDate, TulipCountry tulipCountry) {
        super(name, stemLength, price, arrivalDate);
        this.tulipCountry = tulipCountry;
    }

    public TulipCountry getTulipCountry() {
        return tulipCountry;
    }

    public void setTulipCountry(TulipCountry tulipCountry) {
        this.tulipCountry = tulipCountry;
    }

    @Override
    public String toString() {
        return getName() + "(Tulip, " +
                "country: " + tulipCountry +
                ", stem length: " + getStemLength() +
                ", price: " + getPrice() + ")";
    }
}
