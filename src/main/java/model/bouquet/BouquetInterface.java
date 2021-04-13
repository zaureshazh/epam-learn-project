package model.bouquet;

public interface BouquetInterface {

    String calculateCost();

    String sortByFreshness();

    String searchByStemLength(int minLength, int maxLength);
}
