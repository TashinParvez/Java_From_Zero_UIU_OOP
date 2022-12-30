// 18
import java.util.Scanner;

public class FloydsPrymid {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        int sum = 1;
        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }
}