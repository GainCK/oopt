public class P4Q2 {
    public static void main(String[] args) {
        Student student1 = new Student("A123", "John");

        student1.addQuiz(10);
        student1.addQuiz(9);
        student1.addQuiz(8);

        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Total Score: " + student1.getTotalScore());
        System.out.println("Average Score: " + student1.getAverageScore());
    }

}
