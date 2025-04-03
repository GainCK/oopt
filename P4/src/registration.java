public class registration {
    private int regNo;
    private Owner owner;
    private Car car;
    private static int nextRegno = 1001;

    public registration(Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        this.regNo = nextRegno++;
    }

    public static int getNextRegno() {
        return nextRegno;
    }

    public String toString() {
        return String.format("%-6d -24%s %-39s\n", regNo, owner, car);
    }
}
