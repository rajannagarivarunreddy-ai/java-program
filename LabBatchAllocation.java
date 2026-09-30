import java.util.Scanner;
public class LabBatchAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        switch (roll % 3) {
            case 0:
                System.out.println("Assignment to Lab Batch A");
                break;
            case 1:
                System.out.println("Assignment to Lab Batch B");
                break;
            case 2:
                System.out.println("Assignment to Lab Batch C");
                break;        
        }
    }
}