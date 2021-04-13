package runner;

import enums.BouquetType;
import enums.TulipCountry;
import enums.WrapType;
import model.accessory.Accessory;
import model.accessory.Extension;
import model.accessory.Tape;
import model.accessory.Wrap;
import model.bouquet.Bouquet;
import model.flower.Flower;
import model.flower.Peony;
import model.flower.Rose;
import model.flower.Tulip;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class FlowerShop {

    public void createFlower(FileWriter results, String[] tokens, List<Flower> flowers) throws IOException {
        switch (tokens[1]) {
            case ("Peony"):
                flowers.add(new Peony(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        Integer.parseInt(tokens[4]),
                        LocalDate.of(Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7])),
                        tokens[8]
                ));
                break;
            case ("Rose"):
                flowers.add(new Rose(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        Integer.parseInt(tokens[4]),
                        LocalDate.of(Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7])),
                        tokens[8]
                ));
                break;
            case ("Tulip"):
                flowers.add(new Tulip(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        Integer.parseInt(tokens[4]),
                        LocalDate.of(Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7])),
                        TulipCountry.valueOf(tokens[8])
                ));
                break;
            default:
                results.write("Illegal flower name");
        }
    }

    public void createAccessory(FileWriter results, String[] tokens, List<Accessory> accessories) throws IOException {
        switch (tokens[1]) {
            case ("Extension"):
                accessories.add(new Extension(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        tokens[4]
                ));
                break;
            case ("Tape"):
                accessories.add(new Tape(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        Integer.parseInt(tokens[4])
                ));
                break;
            case ("Wrap"):
                accessories.add(new Wrap(
                        tokens[2],
                        Integer.parseInt(tokens[3]),
                        WrapType.valueOf(tokens[4])
                ));
                break;
            default:
                results.write("Illegal accessory name");
        }
    }

    public String createBouquet(String[] tokens, List<Flower> flowers, List<Accessory> accessories) {
        Bouquet bouquet = new Bouquet(
                tokens[1],
                flowers,
                accessories,
                BouquetType.valueOf(tokens[2])
        );

        return bouquet.toString() +
                "\n" + bouquet.calculateCost() +
                "\n" + bouquet.searchByStemLength(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4])) +
                "\n" + bouquet.sortByFreshness();
    }
}
