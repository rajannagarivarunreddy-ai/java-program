public class SumP1 {
public static void main(String[] args) {
    int n = 123;
    int sum = 0;
    while (n > 0) {
        sum += (n * n) + (n % 10);
        n = n/10;
    }
    System.out.print(sum);
}
}