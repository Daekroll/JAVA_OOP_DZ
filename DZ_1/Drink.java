package DZ_1;

public class Drink {
    protected String name;
    protected int volume;

    public Drink(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, Объем: %dмл.", name, volume);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Drink drink = (Drink) obj;
        return name.equals(drink.name) && volume == drink.volume;
    }
}
