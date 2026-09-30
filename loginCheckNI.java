import java.util.Scanner;
public class loginCheckNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name:");
        String user = sc.next();
        System.out.print("Enter pin");
        int pin = sc.nextInt();
        if (user.equals("admin")) {
            if (pin == 4521) {
                System.out.println("Access granted");
            } else {
                System.out.println("Wrong PIN.");
            }
        } else {
            System.out.println("Unknown user.");
        }
        sc.close();
    }
}