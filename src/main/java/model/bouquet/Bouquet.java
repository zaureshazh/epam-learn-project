package model.bouquet;

import enums.BouquetType;
import model.accessory.Accessory;
import model.flower.Flower;

import java.util.Collections;
import java.util.List;

public class Bouquet implements BouquetInterface {

    private String name;
    private List<Flower> flowers;
    private List<Accessory> accessories;
    private BouquetType bouquetType;

    public Bouquet(String name, List<Flower> flowers, List<Accessory> accessories, BouquetType bouquetType) {
        this.name = name;
        this.flowers = flowers;
        this.accessories = accessories;
        this.bouquetType = bouquetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(BouquetType bouquetType) {
        this.bouquetType = bouquetType;
    }

    @Override
    public String calculateCost() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            cost += accessory.getPrice();
        }

        return "\nTotal Bouquet cost: " + cost;
    }

    @Override
    public String sortByFreshness() {
        StringBuilder builder = new StringBuilder();
        Collections.sort(flowers);
        builder.append("\nFlowers by freshness: ");
        for (Flower flower : flowers) {
            builder.append("\n").append(flower.getName()).append("(arrived on: ").append(flower.getArrivalDate()).append(")");
        }
        return builder.toString();
    }

    @Override
    public String searchByStemLength(int minLength, int maxLength) {
        StringBuilder builder = new StringBuilder();
        builder.append("\nFlowers by stem length between ").append(minLength).append(" and ").append(maxLength).append(":");
        for (Flower flower : flowers) {
            if (flower.getStemLength() <= maxLength && flower.getStemLength() >= minLength) {
                builder.append("\n").append(flower.getName()).append("(").append(flower.getStemLength()).append(")");
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return name + " Bouquet:\n\n" +
                "Flowers:\n" + flowers +
                "\n\nAccessories:\n" + accessories +
                "\n\nBouquet Type:\n" + bouquetType;
    }
}
