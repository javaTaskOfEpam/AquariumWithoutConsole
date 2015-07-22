/**
 * Фильтр нужен рыбкам
 */
public class AquariumFilter implements AquariumItem {
    private final double priceOfFilter = 200;
    private final String nameOfFilter = "membrane filter";

    @Override
    public double getPrice() {
        return priceOfFilter;
    }

    @Override
    public String getName() {
        return nameOfFilter;
    }
}
