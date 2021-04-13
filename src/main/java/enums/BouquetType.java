package enums;

public enum BouquetType {
    EUROPEAN("European"),
    BOX("Box"),
    CLASSIC("Classic"),
    NO_WRAP("No wrap"),
    BASKET("Basket"),
    WEDDING("Wedding");

    private String name;

    BouquetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
