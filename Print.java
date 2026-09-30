import java.util.Scanner;
public class Print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,  a2, a3, a4, a5;
        a1 = sc.nextInt();
        a2 = sc.nextInt(); 
        a3 = sc.nextInt();
        a4 = sc.nextInt();
        a5 = sc.nextInt();
        System.out.print(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
        sc.close();
    }
}