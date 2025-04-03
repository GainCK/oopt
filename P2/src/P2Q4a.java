public class P2Q4a {
    public static double calculateAverage (int a, int b){
        return (a + b) / 2.0;
    }

    public static double calculateAverage (int a, int b, int c){
        return (a +b +c) / 3.0;
    }
    public static double calculateAverage (double a, double b){
        return (a +b) / 2.0;
    }
    public static double calculateAverage (double a, double b, double c){
        return (a +b +c) / 3.0;
    }
    
    public static void main (String[] args){
        System.out.println("Average of 2 integers (10, 20): " + calculateAverage(10, 20));
        System.out.println("Average of 3 integers (10, 20, 30): " +calculateAverage(10, 20, 30));
        System.out.println("Average of 2 doubles (10.5, 20.5): " + calculateAverage(10.5, 20.5));
        System.out.println("Average of 3 doubles (10.5, 20.5 30.5): " + calculateAverage(10.5, 20.5, 30.5));
    }

}
