public class P4Q1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ken Lin", 2500);
        Employee emp2 = new Employee("Ben John");
        emp2.setSalary(3000);

        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println(emp1.getName() + " has a higher salary than " + emp2.getName());
        } else {
            System.out.println(emp2.getName() + " has a higher salary than " + emp1.getName());
        }

        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println(emp1.getName() + " has a higher salary than " + emp2.getName());
        } else {
            System.out.println(emp2.getName() + " has a higher salary than " + emp1.getName());
        }
    }

}
