public class P4Q3 {
    public static void main(String[] args) {
        Student2.setContribution(20);
        Student2 stud1 = new Student2("A123", "John");

        stud1.addQuiz(10);
        stud1.addQuiz(9);
        stud1.addQuiz(8);

    System.out.print("Name:");
    System.out.println(stud1.getName());
    System.out.print("Total Score:");
    System.out.println(stud1.getTotalScore());
    System.out.print("Average Score:");
    System.out.println(stud1.getAverageScore());
    System.out.print("Total marks obtained:");
    System.out.println(stud1.getAverageScore() / 10 * Student2.getContribution());
    }
}
