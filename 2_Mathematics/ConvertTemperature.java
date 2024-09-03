import java.util.Scanner;

// Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

// Example 1:

// Input:
// C = 32
// Output: 89
// Explanation: Using the conversion 
// formula of celsius to farhenheit , it
// can be calculated that, for 32 degree
// C, the temperature in Fahrenheit = 89.
// Example 2:

// Input:
// 50
// Output: 122
// Explanation: Using the conversion 
// formulaof celsius to farhenheit, it
// can be calculated that, for 50 degree
// C, the temperature in Fahrenheit = 122.

public class ConvertTemperature {
    double fahrenheitToCelsius(double temp){
        return (temp - 32) * 5/9;
    }
    double celsiusToFahrenheit(double temp){
        return (temp * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("************* NOTE: Press 1/2 **************");
            System.out.println("1.Fahrenheit to celcius");
            System.out.println("2. Celcius to farhenheit");
            System.out.print("Select an option: ");
            int choice = input.nextInt();

            ConvertTemperature obj = new ConvertTemperature();
            double celcius,fahrenheit;

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit temperature: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Celsius temperature: "+(obj.fahrenheitToCelsius(fahrenheit)));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit temperature: ");
                    celcius = input.nextDouble();
                    System.out.println("Fahrenheit temperature: "+(obj.celsiusToFahrenheit(celcius)));
                    break;
                default:
                    System.out.println("You selected  wrong option!");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            input.close();
        }

    }
}
