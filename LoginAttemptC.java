import java.util.Scanner;
public class LoginAttemptC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpassword = "uniflow123";
        int attempts = 0;
        boolean accessGranted = false;
        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();
            attempts++;
            if (input.equals(correctpassword)){
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect password. Attempt" + attempts + "of 3");
            }
        }
        if (accessGranted) {
            System.out.println ("Access Granted");
        }else {
            System.out.println("Account Locked");
        }
    }
}    