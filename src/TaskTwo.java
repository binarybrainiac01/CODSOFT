import java.util.Scanner;
public class TaskTwo
{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***GRADING SYSTEM***\n\n");
        System.out.print("Enter your name : ");
        String studentName = input.nextLine();
        System.out.print("Enter your registration ID : ");
        int regId=input.nextInt();
        input.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
        }
}
