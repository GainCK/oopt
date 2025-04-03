public class Car {
    private String plateNo;
    private String color;
    private int year;
    private CarType cartype;


public Car(String plateNo, String color, int year, CarType cartype) {
    this.plateNo = plateNo;
    this.color = color;
    this.year = year;
    this.cartype = cartype;
}

public String toString() {
    return String.format("%-10s %-8s %-6s %-15s", plateNo, color, year, cartype);
}
}
