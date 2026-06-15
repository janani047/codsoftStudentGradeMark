import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner jan = new Scanner(System.in);
        int totalmark = 0;

        System.out.println("=== Student Grade Calculator ===");
        System.out.println("Enter Number Of Subjects:");
        int subject = jan.nextInt();
        for (int i = 1; i<=subject; i++) {
            System.out.println("Enter marks for subject" + i + ":");
            int marks = jan.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid Mark");
                marks = jan.nextInt();
            }
            totalmark += marks;
        }
        double averagePercentage = (double) totalmark / subject;
        System.out.println("==== RESULT =====");
        System.out.println("Totalmarks:" + totalmark);
        System.out.println("Average Percentage:" + averagePercentage + "%");
        if (averagePercentage >= 90) {
            System.out.println("GRADE A\nExcellent");
        } else if (averagePercentage >= 80) {
            System.out.println("GRADE B\nVery Good");
        } else if (averagePercentage >= 70) {
            System.out.println("GRADE C\nGood");

        } else if (averagePercentage >= 60) {
            System.out.println("GRADE D\n Try to get good mark ");
        } else if (averagePercentage >= 50) {
            System.out.println("GRADE E\nImprove more");
        } else {
            System.out.println("FAIL\nDon't worry try next time");
        }
        jan.close();
    }

}
