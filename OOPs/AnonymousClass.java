interface Car {
    void drive();
}

// class WagonR implements Car {
//     public void drive() {
//         System.out.println("Driving WagonR...");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        // Car c = new WagonR();
        // c.drive(); // Output: Driving WagonR...

        Car c = new Car(){
            public void drive() {
                System.out.println("Driving Anonymous Car...");
            }
        };

        c.drive();
    }
}
