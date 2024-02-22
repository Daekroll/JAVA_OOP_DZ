package DZ_1;

import java.util.ArrayList;

public class HotDrinkVendingMachine implements VendingMachine {
    ArrayList<HotDrink> drinks;

    public void initDrinks(ArrayList<HotDrink> drinks){
        this.drinks = drinks;
    }

    @Override
    public void getDrink(String name, int volume){
        for (Drink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume){
                System.out.println(drink);
            }
        }
    }

    public void getDrink(String name, int volume, int temperature){
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature){
                System.out.println(drink);
            }
        }
    }
}
