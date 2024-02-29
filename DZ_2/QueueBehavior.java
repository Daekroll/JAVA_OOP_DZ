package DZ_2;

public interface QueueBehavior {
    
    void takeInQueue(Actor actor);

    void takeOrders();
    
    void giveOrder();

    void releaseFromQueue();
}
