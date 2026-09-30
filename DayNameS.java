import java.util.Scanner;
public class DayNameS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day:");
        int day = sc.nextInt();
        String name;
        switch (day) {
            case 1: name = "Monday";
                  break;
            case 2: name = "Tuesday";
                 break;
            case 3: name = "Wednesday";
                 break;
            case 4: name = "Thursday";
                break;
            case 5: name = "Friday";
                   break;
            default: name = "Weekend";
                    break;                     
        }
        System.out.println("Day:" + name);
        sc.close();
    }
}