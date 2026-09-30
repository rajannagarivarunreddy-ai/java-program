public class Diagonal {
    public static void main(String[]args) {
        int[][] zer = new int[4] [4];
        for (int i=0; i <= 4; i++) {
            for (int j=0; j<=4; j++) {
                if (i==j) {
                    System.out.print("0");
                } else 
                    System.out.print(" "+j);
                }
                System.out.println();
            }
        }
    }
