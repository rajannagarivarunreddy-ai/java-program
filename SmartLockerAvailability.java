import java.util.Scanner;
public class SmartLockerAvailability {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Locker Number;");
    int LockerNumber = sc.nextInt();
    if (LockerNumber>=1 && LockerNumber<=20) {
        System.out.println("Locker Available");
    } else {
        System.out.println("Invalid Locker Number");
    }
    sc.close();
  }
}