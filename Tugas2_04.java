
import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;

                System.out.print(result + "\t");
                total += result;
            }
            System.out.println();
        }

        System.out.println("Total: " + total);

        sc.close();
    }
}
