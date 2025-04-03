public class P2Q4 {
    // Method to calculate average of 2 integers
    public static double calculateAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    // Method to calculate average of 3 integers
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method to calculate average of 2 doubles
    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }

    // Method to calculate average of 3 doubles
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // The main method is the entry point of the program
    public static void main(String[] args) {

        // Demonstrate calculateAverage with 2 integers
        System.out.println("Average of 2 integers (4, 8): " + calculateAverage(4, 8));

        // Demonstrate calculateAverage with 3 integers
        System.out.println("Average of 3 integers (4, 8, 12): " + calculateAverage(4, 8, 12));

        // Demonstrate calculateAverage with 2 doubles
        System.out.println("Average of 2 doubles (4.5, 8.5): " + calculateAverage(4.5, 8.5));

        // Demonstrate calculateAverage with 3 doubles
        System.out.println("Average of 3 doubles (4.5, 8.5, 12.5): " + calculateAverage(4.5, 8.5, 12.5));
    }
}