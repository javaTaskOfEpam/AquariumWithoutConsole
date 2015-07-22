/**
 * Точка входа в программу
 */
public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addItemToAquarium(new Fish("fish1", 13));
        aquarium.addItemToAquarium(new Fish("fish2", 15));
        aquarium.addItemToAquarium(new Reptile("rept1", 51));
        aquarium.addItemToAquarium(new Reptile("rept2", 251));
        aquarium.addItemToAquarium(new Reptile("rept3", 651));
        System.out.println(aquarium.toString());
    }
}
