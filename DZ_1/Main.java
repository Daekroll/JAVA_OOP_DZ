package DZ_1;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<HotDrink> drinks = new ArrayList<>();

        drinks.add(new HotDrink("Coffee", 200, 90));
        drinks.add(new HotDrink("Tea", 350, 90));
        drinks.add(new HotDrink("Latte", 350, 80));
        drinks.add(new HotDrink("Americano", 200, 90));
        drinks.add(new HotDrink("Hot Chocolate", 350, 70));
        drinks.add(new HotDrink("Ice Tea", 300, 14));
        drinks.add(new HotDrink("Ice Coffee", 250, 16));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initDrinks(drinks);
        hotDrinkVendingMachine.getDrink("Coffee", 200, 90);
    }
}
