package DZ_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        Actor actor1 = new Human();
        Actor actor5 = new Human();
        Actor actor4 = new Human();
        Actor actor3 = new Human();
        Actor actor2 = new Human();
        actor1.setName("Леха");
        actor5.setName("Вася");
        actor4.setName("Паша");
        actor3.setName("Миша");
        actor2.setName("Маша");
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        actors.add(actor4);
        actors.add(actor5);
        Market market = new Market(actors);
        market.update();
    }
}
