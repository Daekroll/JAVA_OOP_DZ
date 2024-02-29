package DZ_2;

public class Human extends Actor {
    
    public Human(){
        super.name = name;
        super.isMakeOrder = false;
        super.isTakeOrder = false;
    }
    @Override
    String getName() {
        return name;
    }
    @Override
    void setName(String name) {
        this.name = name;
    }
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }
    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    
}
