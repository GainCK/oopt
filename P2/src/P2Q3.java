public class P2Q3 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-20s %-15s %-10s\n\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        for (double i = 0; i <= 50d; i += 10) {
            System.out.printf("%-10.1f %-20.4f %-15.1f %-10.4f\n",
                    (double) i, celsiusToFahrenheit(i), (double) (i + 50), fahrenheitToCelsius(i + 50));
        }
    }
}