import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name:");
        String user = sc.next();
        System.out.print("Enter pin:");
        int pin = sc.nextInt();
        if (user.equals("admin")) {
            if (pin == 1234) {
                System.out.println("Aceess Granted");
            } else {
                System.out.println("Wrong pin");
            }
        } else {
            System.out.println("Wrong user");
        }        
    }
}