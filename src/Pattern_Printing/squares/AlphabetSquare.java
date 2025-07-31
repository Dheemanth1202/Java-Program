package Pattern_Printing.squares;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // Rows
            for (int j = 1; j <= n; j++) { // Columns
                System.out.print((char)(j + 64)+ " ");
            }
            System.out.println();
        }
    }
}