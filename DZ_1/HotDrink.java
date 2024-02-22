package DZ_1;

public class HotDrink extends Drink {
    private int temperature;
    
    public HotDrink(String name, int volume, int temperature){
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, Температура: %d", super.toString(), temperature);
    }

    @Override
    public boolean equals(Object obj) {
        HotDrink hotDrink = (HotDrink) obj;
        return super.equals(obj) && temperature == hotDrink.temperature;
    }
}
