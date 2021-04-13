package runner;

import model.accessory.Accessory;
import model.flower.Flower;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        List<String> fileData = new ArrayList<>();
        List<Flower> flowers = new ArrayList<>();
        List<Accessory> accessories = new ArrayList<>();

        try (FileWriter results = new FileWriter("src/main/resources/results.txt")) {
            try (Scanner data = new Scanner(new File("src/main/resources/source.txt"))) {
                while (data.hasNext()) {
                    fileData.add(data.nextLine());
                }
            }

            for (String line : fileData) {
                String[] tokens = line.split("-");

                switch (tokens[0]) {
                    case ("Flower"):
                        flowerShop.createFlower(results, tokens, flowers);
                        break;
                    case ("Accessory"):
                        flowerShop.createAccessory(results, tokens, accessories);
                        break;
                    case ("Bouquet"):
                        results.write(flowerShop.createBouquet(tokens, flowers, accessories));
                        break;
                    default:
                        results.write("Illegal object name");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
