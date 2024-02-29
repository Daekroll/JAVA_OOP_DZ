package DZ_2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected  boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();
    abstract void setName(String name);
    @Override
    public String toString() {
        return String.format("Имя %s", this.name);
    }
}
