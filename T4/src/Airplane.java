public class Airplane {
    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private static int numOfAirplane = 0;

    public Airplane() {
        this("XXX 0000", 0.0, 0, 0);
    }

    public Airplane(String id, double price, int yearOfPurchased, int numOfPassenger) {
        this.id = id;
        this.price = price;
        this.yearOfPurchased = yearOfPurchased;
        this.numOfPassenger = numOfPassenger;
        numOfAirplane++;
    }
    public void setID(String id) {
        this.id = id;
    }   

    public void setNumofPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public String getID() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPurchased() {
        return yearOfPurchased;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }
    public static int getNumOfAirplane() {
        return numOfAirplane;
    }

    public double calCurrentValue(){
        double currentPrice;
        currentPrice = price - (price * 0.1 * (2011 - yearOfPurchased));
        if(currentPrice < 0){
            currentPrice = 0;
        }
        return currentPrice;
    }
    public String toString() {
    return String.format("%-10s %-10.2f %-10d %-10d %-10.2f", id, price, yearOfPurchased, numOfPassenger, calCurrentValue());
}
}
