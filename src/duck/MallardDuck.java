package duck;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyingWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
