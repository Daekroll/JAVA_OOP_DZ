package DZ_2;

import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{
    List<Actor> actors;
    public Market(List<Actor> actors){
        this.actors = actors;
    }
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
    public List<Actor> getActors() {
        return actors;
    }
    @Override
    public void takeInQueue(Actor actor) {
        actors.addLast(actor);
        takeOrders();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Добро пожаловать в наш магазин!");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromQueue() {
        giveOrder();
        actors.remove(0);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println("Досвидания " + actors.get(0)+  ", приходите еще!");
        releaseFromQueue();
    }
    @Override
    public void takeOrders(){
        System.out.println("Спасибо за заказ, ожидайте!");
    }
    @Override
    public void giveOrder() {
        System.out.println("Спасибо за ожидание, вот ваш заказ!" + actors.get(0));
    }
    @Override
    public void update() {
        if (actors.get(0).isTakeOrder){
            actors.get(0).isMakeOrder();
            giveOrder();
            releaseFromMarket(actors);
        } else {
            actors.get(0).isTakeOrder();
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
