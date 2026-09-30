import java.util.Scanner;
public class Examination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name:");
        String studentname = sc.nextLine();
        System.out.print("Enter percentage:");
        double percentage = sc.nextDouble();
        if (percentage >= 75) {
            System.out.println("eligible for exam");
        } else {
            System.out.println("not eligible");
        }
        sc.close();
    }
}