import java.util.ArrayList;

/**
 * Класс описывающий аквариум
 */
public class Aquarium {
    private ArrayList<AquariumItem> aquariumItems;
    private boolean isLampAdded;
    private boolean isFilterAdded;

    public Aquarium() {
        this.aquariumItems = new ArrayList<>();
    }

    private String getAquariumContent() {
        StringBuilder resultAquariumContnt = new StringBuilder("[ ");
        for (AquariumItem aquariumItem : aquariumItems)
            resultAquariumContnt.append(aquariumItem.getClass().getSimpleName())
                    .append(":").append(aquariumItem.getName()).append(":")
                    .append(aquariumItem.getPrice()).append("; ");
        resultAquariumContnt.append("]");
        return resultAquariumContnt.toString();
    }

    private double getTotalPrice() {
        double result = 0;
        for (AquariumItem aquariumItem : aquariumItems)
            result += aquariumItem.getPrice();
        return result;
    }

    public void addItemToAquarium(AquariumItem aquariumItem) {
        aquariumItems.add(aquariumItem);
        if (!isLampAdded && aquariumItem.getClass().equals(Reptile.class)) {
            aquariumItems.add(new AquariumLamp());
            isLampAdded = true;
        }
        if (!isFilterAdded && aquariumItem.getClass().equals(Fish.class)) {
            aquariumItems.add(new AquariumFilter());
            isFilterAdded = true;
        }
    }

    @Override
    public String toString() {
        return getAquariumContent() + "\n" + "Total price of aquarium is: " +getTotalPrice();
    }

}
