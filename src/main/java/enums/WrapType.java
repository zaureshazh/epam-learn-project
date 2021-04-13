package enums;

public enum WrapType {
    PAPER("Paper"),
    NET("Net"),
    MICA("Mica");

    private String name;

    WrapType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
