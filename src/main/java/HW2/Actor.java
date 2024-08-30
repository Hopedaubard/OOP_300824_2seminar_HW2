package HW2;

public abstract class Actor implements ActorBehavioir{
    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    protected Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}
