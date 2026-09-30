import java.util.Scanner;
public class AssignmentOperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int value = num;
        System.out.println("\nAfter '=' Assignment :" + value);
        value += 10;
        System.out.println("After '+=' (Add10) :" + value);
        value -= 5;
        System.out.println("After '-=' (Substract 5) :" + value);
        value *= 2;
        System.out.println("After '*=' (Multiplication 2) :" + value);
        value /= 3;
        System.out.println("After '/=' (Division 3) :" + value);
        value %= 4;
        System.out.println("After '%=' (Modulus by 4) :" + value);
        sc.close();
    }
}