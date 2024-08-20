import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void convertTemperature(double temp, char unit) {
        switch (unit) {
            case 'C':
                double fahrenheitFromC = celsiusToFahrenheit(temp);
                double kelvinFromC = celsiusToKelvin(temp);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", temp, fahrenheitFromC, kelvinFromC);
                break;
            case 'F':
                double celsiusFromF = fahrenheitToCelsius(temp);
                double kelvinFromF = fahrenheitToKelvin(temp);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", temp, celsiusFromF, kelvinFromF);
                break;
            case 'K':
                double celsiusFromK = kelvinToCelsius(temp);
                double fahrenheitFromK = kelvinToFahrenheit(temp);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", temp, celsiusFromK, fahrenheitFromK);
                break;
            default:
                System.out.println("Invalid unit entered. Please use C, F, or K.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        convertTemperature(temp, unit);

        scanner.close();
    }
}
