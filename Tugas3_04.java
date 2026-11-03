
import java.util.Scanner;

public class Tugas3_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("The number of stores must be greater than 0.");
            sc.close();
            return;
        }

        int totalSemuaToko = 0;
        int penjualanTertinggi = -1;
        int tokoTerbaik = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Enter sales for Store " + i + ": ");
            int penjualan = sc.nextInt();

            while (penjualan < 0) {
                System.out.println("Sales cannot be negative.");
                System.out.print("Enter sales again: ");
                penjualan = sc.nextInt();
            }

            totalSemuaToko += penjualan;

            System.out.println("Sales of Store " + i + ": " + penjualan);

            if (penjualan > penjualanTertinggi) {
                penjualanTertinggi = penjualan;
                tokoTerbaik = i;
            }
        }

        System.out.println("\n=== SALES SUMMARY ===");
        System.out.println("Total sales: " + totalSemuaToko);
        System.out.println("Store with highest sales: Store " + tokoTerbaik);
        System.out.println("Highest sales: " + penjualanTertinggi);

        sc.close();
    }
}
