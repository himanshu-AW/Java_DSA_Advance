
class A {  
     void show(){
        System.out.println("Show....");
     }
     static void showA(){
        System.out.println("Show-class-A.... from static method");
     }

     class B{
        void display(){
            System.out.println("Display....");
        }
        static void displayB(){
            System.out.println("Display-class-B.... from static method");
        }
     }
     static class C{
        void display(){
            System.out.println("Display....");
        }
        static void displayC(){
            System.out.println("Display-class-C.... from static method");
        }
     }
}

public class InnerClass {
        // inerr class -> normal , static , Anonymous
    public static void main(String[] args) {

        A a = new A();
        a.show();
        A.showA();

        A.B b = a.new B();
        b.display();
        b.displayB();

        A.C c = new A.C();
        c.display();
        c.displayC();

        A d = new A(){
            void show(){
                System.out.println("Normal method from anonymous class....");
            }
            static void showA(){
                System.out.println("Static method from anonymous class....");
            }
        };

        d.show();
        d.showA();

    }
}