/**
 * Лампа нужна рептилиям
 */
public class AquariumLamp implements AquariumItem {
    private final double priceOfLamp = 200;
    private final String nameOfLamp = "Yellow lamp";

    @Override
    public double getPrice() {
        return priceOfLamp;
    }

    @Override
    public String getName() {
        return nameOfLamp;
    }
}
