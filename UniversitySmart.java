import java.util.Scanner;
public class UniversitySmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parcel ID:");
        int parcelID = sc.nextInt();
        System.out.print("Enter recipent name:");
        String recipentname = sc.next();
        System.out.print("Enter mobile number:");
        long num = sc.nextLong();
        System.out.print("Enter parcel size:");
        String parcelsize = sc.next();
        
        String locker;
        if (parcelsize.equals("small")) {
            locker = "Locker A";
        } else if (parcelsize.equals("medium")) {
            locker = "Locker B";
        } else {
                locker = "Locker C";  
        }
        System.out.print("Enter parcel weight:");
        double parcelweight = sc.nextDouble();
        System.out.print("if express type true else false:");
        boolean express = sc.nextBoolean();
        double fee = express ? 40 : 20 ;
        int pickupcode = parcelID + 5000;

        System.out.println("The parcel ID:" + parcelID);
        System.out.println("The recipent name:" + recipentname);
        System.out.println("The mobile number:" + num);
        System.out.println("The parcel size:" + parcelsize);
        System.out.println("The locker assigned:" + locker);
        System.out.println("The parcel weight:" + parcelweight);
        System.out.println("Service served:" + express);
        System.out.println("The fee:" + fee);
        System.out.println("The pickup code:" + pickupcode);
        sc.close();
    }
}