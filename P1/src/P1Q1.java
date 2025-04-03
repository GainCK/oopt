import java.util.Scanner;

public class P1Q1 {
    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scannerA.nextLine();

        System.out.print("How many subjects you have in this semester: ");
        int subjects = scannerA.nextInt();
        scannerA.nextLine(); 

        System.out.print("What is the programme that you're currently studying? ");
        String program = scannerA.nextLine();

        System.out.println("\nWelcome " + name + " from " + program + "!");
        System.out.println("Good Luck in all " + subjects + " courses you have in this semester!");
        
        scannerA.close();
    }
}
