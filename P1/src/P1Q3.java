import java.util.Scanner;

public class P1Q3 {
    public static void main(String[] args) throws Exception {

        Scanner scannerC = new Scanner(System.in);

        System.out.println("Enter 8-digit credit card number: ");
        int cardNumber = scannerC.nextInt();

        // START Mathematically
        int sum1 = 0;
        int temp1 = cardNumber;

        for (int i = 1; i < 8; i += 2) {
            sum1 += temp1 % 10;
            temp1 /= 10; // move left two digits, base ten
        }

        int sum2 = 0;
        int temp2 = cardNumber / 10;

        for (int i = 1; i < 8; i += 2) {
            int digit = (temp2 % 10) * 2;
            sum2 += digit % 10;
            digit /= 10;
            sum2 += digit % 100;
            temp2 /= 100;
        }
        // END Mathematically

        int finalSum = sum1 + sum2;

        if (finalSum % 10 == 0) {
            System.out.println("The credit card number is valid");
        } else {
            System.out.println("The credit card number is invalid");
            System.out.println("The last digit should be " + ((cardNumber - finalSum + 10) % 10));
        }
        scannerC.close();
    }
}