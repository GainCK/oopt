public class T4Q6 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("XYZ 0001", 250000.00, 2005, 100);

        plane1.setID("AWX 1003");
        plane1.setNumofPassenger(190);
        System.out.println(plane1.toString() + "\nCurrent Price : " + plane1.calCurrentValue());
        System.out.println(plane2.toString() + "\nCurrent Price : " + plane2.calCurrentValue());
    }
}
