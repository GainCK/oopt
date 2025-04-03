import java.util.Scanner;

public class P1Q2 {
    public static void main(String[] args) throws Exception {
        final int KM_TO_METER = 1000;
        final int METER_TO_CM = 100;
        final int CM_TO_MM = 10;

        Scanner scannerB = new Scanner(System.in);

        System.out.print("Enter a distance in kilometer: ");
        int km = scannerB.nextInt();

        int meter = km * KM_TO_METER;
        int cm = meter * METER_TO_CM;
        int mm = cm * CM_TO_MM;
        
        scannerB.close();

        System.out.println("Distance in Kilometer: " + km + " kilometer");
        System.out.println("Distance in Meter: " + meter + " meter");
        System.out.println("Distance in Centimeter: " + cm + " centimeter");
        System.out.println("Distance in Millimeter: " + mm + " milimeter");
    }
}