package model.flower;

import java.time.LocalDate;

public abstract class Flower implements Comparable<Flower> {
    private String name;
    private LocalDate arrivalDate;
    private int stemLength;
    private int price;

    protected Flower(String name, int stemLength, int price, LocalDate arrivalDate) {
        this.name = name;
        this.stemLength = stemLength;
        this.price = price;
        this.arrivalDate = arrivalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Flower flower) {
        return getArrivalDate().compareTo(flower.getArrivalDate());
    }
}
