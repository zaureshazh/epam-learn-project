package enums;

public enum TulipCountry {
    NETHERLANDS("Netherlands"),
    TURKEY("Turkey");

    private String name;

    TulipCountry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
