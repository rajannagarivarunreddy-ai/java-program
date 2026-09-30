import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance amount:");
        int num = sc.nextInt();
        num += 3500;
        System.out.println("After '+=' Assignment:" + num);
        sc.close();
    }
}