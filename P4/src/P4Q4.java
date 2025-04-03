import java.util.Scanner;

public class P4Q4 {
    public static void main(String[] args) {
        CarType[] cartype = {new CarType("Toyota", "Vios", 1.5),
         new CarType("Nissan", "Teana", 2.0),
          new CarType("Honda", "City", 1.6)};

        registration[] regArr = new registration[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < regArr.length; ++i) {
            System.out.println("\nRegistration number: " + registration.getNextRegno());
            System.out.print("Enter owner's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter owner's IC number: ");
            String icNo = scanner.nextLine();
            Owner owner = new Owner(name, icNo);

            System.out.print("\nCar Plate No: ");
            String plateNo = scanner.next();
            System.out.print("Enter color: ");
            String color = scanner.next();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            System.out.println("\nCar Types");
            for (int j = 0; j < cartype.length; ++j) {
                System.out.println((j + 1) + ". " + cartypeArr[j]);
            }
            System.out.print("Select car type [1-" + cartype.length + "]: ");
            int carType = scanner.nextInt();
            CarType cartype = cartypeArr[selection - 1];
            Car car = new Car(plateNo, color, year, cartype);

            regArr[i] = new registration(owner, car);
            scanner.nextLine();
    }
    displaylisting(regArr);
}

public static void displaylisting(registration[] regArr) {
    System.out.printf("\n\n%50s\n", "Car Registration Listing");
}
}
