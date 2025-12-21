import java.util.Scanner;

public class StudentGrade {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Marks (out of 100):");
        System.out.print("Enter marks for Mathematics: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks for Computer Science: ");
        int computer = sc.nextInt();

        System.out.print("Enter marks for Hindi: ");
        int hindi = sc.nextInt();

        int total = maths+ physics+ chemistry+ english+ computer+ hindi;

        double per = total/ 6.0;

            char grade;
        if(per >= 90) 
            grade = 'A';
        else if(per >= 75) 
            grade = 'B';
        else if(per >= 60) 
            grade = 'C';
        else if(per >= 50) 
            grade = 'D';
        else
            grade = 'F';
        
        System.out.println("========RESULT========");
        System.out.println("Total Marks: " + total + "/600");
        System.out.println("Percentage: " + per + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}