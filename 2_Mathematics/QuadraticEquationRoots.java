import java.util.ArrayList;
import java.util.Scanner;

// Given a quadratic equation in the form ax2 + bx + c. Find its roots.

// Example 1:

// Input:
// a = 1
// b = -2
// c = 1
// Output: 1 1
// Explanation:
// Roots of equation x2-2x+1 are 1 and 1.

// Example 2:

// Input:
// a = 1
// b = -7
// c = 12
// Output: 4 3
// Explanation: Roots of equation 
// x2 - 7x + 12 are 4 and 3

public class QuadraticEquationRoots {
    ArrayList<Long> findRoots(int a, int b, int c){
        ArrayList<Long> roots = new ArrayList<>();

        // calculate discriminant
        double discriminant = b*b - 4*a*c;
        
        // check the nature of roots
        if(discriminant > 0){
            // two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            roots.add((long) root1);
            roots.add((long) root2);
        } else if(discriminant == 0){
            // two same real roots
            double root = -b / (2*a);
            roots.add((long) root);
            roots.add((long) root);
        } else{
            // Roots are complex and imaginary
            // double realPart = (-b)/(2*a);
            // double imaginaryPart = Math.sqrt(-discriminant) / (2*a);
            // roots.add((long) realPart + imaginaryPart j);
            // roots.add((long) realPart - imaginaryPart j);
        }
        return roots;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("The quadratic equation : 'ax2 + bx + c' ");
            System.out.print("'Enter value of 'a' : ");
            int a = input.nextInt();
            System.out.print("'Enter value of 'b' : ");
            int b = input.nextInt();
            System.out.print("'Enter value of 'c' : ");
            int c = input.nextInt();
            
            QuadraticEquationRoots obj = new QuadraticEquationRoots();
            ArrayList<Long> roots = obj.findRoots(a, b, c);
            if(roots.isEmpty()){
                System.out.println("Roots are Complex and Imaginary.");
            }else{
                System.out.println("X1: "+roots.get(0));
                System.out.println("X2: "+roots.get(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            input.close();
        }
    }
}
