package Pattern_Printing.squares;
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1; i <= m; i++){
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}