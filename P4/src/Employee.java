public class Employee {
    private String name;
    private double salary;

    public Employee(){
        name = "";
        salary = 0.0;
    }

    public Employee(String employeeName, double currentSalary) {
    name = employeeName;
    salary = currentSalary;
    }

    public Employee(String employeeName) {
        name = employeeName;
        salary = 0.0;
        }

    public String getName(){
    return name;
    }

    public double getSalary(){
    return salary;
    }

    public double setSalary(double newSalary){
    salary = newSalary;
    return salary;
    }

    public String setName(){
    return name;
    }

    void raiseSalary(double percent){
    salary = salary + (salary * percent / 100.0);
    }
    
}