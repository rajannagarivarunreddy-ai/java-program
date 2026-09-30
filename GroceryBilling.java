import java.util.Scanner;
public class GroceryBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerKg = 60;
        System.out.print("Enter Customer Name:");
        String CustomerName = sc.nextLine();
        System.out.print("Enter Quantity Purchased(Kg):");
        double quantity = sc.nextDouble();
        double totalBill = quantity*pricePerKg;
        System.out.println("\n================================");
        System.out.println("  GROCERY STORE BILL     ");
        System.out.println("Customer Name :" + CustomerName);
        System.out.println("Rice Price :" + pricePerKg + "per Kg");
        System.out.println("Quantity Purchased:" + quantity + "Kg");
        System.out.println("Total Bill  :" + totalBill);
        System.out.println("=========================");
        sc.close();
        }
}