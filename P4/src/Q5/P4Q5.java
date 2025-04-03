package Q5;

public class P4Q5 {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computer", 250.00);
        course.addStudent("Ali Said");
        course.addStudent("Wong Ken");
        course.addStudent("Peter Lim");



        System.out.println("\nTotal Fees collected : " + course.calcFeeCollected());
        String[] names = course.getstudentName();
        System.out.println("\nList of student in the course : ");
        for (int i = 0; i < course.getnoOfStudent(); i++) {
            System.out.println(names[i]);
        }

    }
}
