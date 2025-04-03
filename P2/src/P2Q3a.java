public class P2Q3a {
    
    public static double celciustofahrenheit(double celcius){
        return (celcius * 9 / 5 ) +32;
    }

    public static double fahrenheittocelcius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-15s %-10s\n\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        for (double i = 0; i<=100; i+=10){
            System.out.printf("%-10.1f %-15.4f %-15.1f %-10.4f\n",
            (double) i , celciustofahrenheit(i) , (double) (i+50) , fahrenheittocelcius(i+50));

        }
    }

}
