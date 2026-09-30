import java.util.Scanner;
public class InventoryA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stock = new int[6];
        System.out.println("Enter stock for 6 products: ");
        for (int i = 0; i < stock.length; i++) {
            stock[i] = sc.nextInt();
        }
        System.out.println("Product below reorder level: ");
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < 10) {
                System.out.println("product " + (i + 1) + "->" + stock[i] + "units");
            }
        }
        sc.close();
    }
}