package model.accessory;

public class Extension extends Accessory {
    private String extensionType;

    public Extension(String name, int price, String extensionType) {
        super(name, price);
        this.extensionType = extensionType;
    }

    public String getExtensionType() {
        return extensionType;
    }

    public void setExtensionType(String extensionType) {
        this.extensionType = extensionType;
    }

    @Override
    public String toString() {
        return "Extension: " + getName() +
                "(" + extensionType +
                ", price: " + getPrice() + ")";
    }
}
