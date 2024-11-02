

interface Car {
    void drive();
}

@FunctionalInterface
interface Animal{
    void eat();
    // void sleep();
}

public class LamdaExpression {
    public static void main(String[] args) {
        Car c = ()-> System.out.println("Driving...");
        c.drive();


        Animal a = ()-> {
            System.out.println("Eating...");
            // System.out.println("Sleeping...");
        };
        a.eat();
        // a.sleep();
    }
}
