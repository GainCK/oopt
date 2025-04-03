import java.util.Scanner;

public class P3Q1 {

    public static double calculateAverage(int[] score, int quiz){
        int sum = 0;
        for(int i=0; i < quiz; i++){
            sum += score[i];
        }
        return (double) sum / quiz;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int quiz = scanner.nextInt();

        int[] score = new int[quiz];//array

        for(int i=1; i<=quiz; i++){
            System.out.print("Score " + i + ": ");
            score[i-1] = scanner.nextInt();//read and store each score from i=0
        }

        scanner.close();

        System.out.println();

        System.out.println("Result");
        System.out.println("========");

        double Average = calculateAverage(score, quiz);

        System.out.println("Average :" + Average);

        int AboveEqual = 0;
        int Below = 0;

        for(int i =0; i <quiz; i++){
            if(score[i] >= Average){
                AboveEqual++;
            }
            else{
                Below++;
            }
        }

        System.out.println("Number of scores above or equal to the average is " + AboveEqual);
        System.out.println("Number of scores below the average is " + Below);
    }
}
