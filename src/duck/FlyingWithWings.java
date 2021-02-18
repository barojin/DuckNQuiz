package duck;

// implementation classes

public class FlyingWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
