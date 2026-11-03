
import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of groups: ");
        int jumlahKelompok = sc.nextInt();

        System.out.print("Enter the number of judges: ");
        int jumlahJuri = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahJuri <= 0) {
            System.out.println("The number of groups and judges must be greater than 0.");
            sc.close();
            return;
        }

        double nilaiTertinggi = -1;
        int kelompokTerbaik = 0;

        for (int i = 1; i <= jumlahKelompok; i++) {
            double totalNilai = 0;

            System.out.println("\nGroup " + i);

            for (int j = 1; j <= jumlahJuri; j++) {
                System.out.print("Enter score from judge " + j + ": ");
                double nilai = sc.nextDouble();

                while (nilai < 0 || nilai > 100) {
                    System.out.println("Score must be between 0 and 100.");
                    System.out.print("Enter score again: ");
                    nilai = sc.nextDouble();
                }

                totalNilai += nilai;
            }

            double rataRata = totalNilai / jumlahJuri;

            System.out.printf("Average score of Group %d: %.2f%n",
                    i, rataRata);

            if (rataRata > nilaiTertinggi) {
                nilaiTertinggi = rataRata;
                kelompokTerbaik = i;
            }
        }

        System.out.println("\n=== RESULT ===");
        System.out.println("Best group: Group " + kelompokTerbaik);
        System.out.printf("Highest average score: %.2f%n", nilaiTertinggi);

        sc.close();
    }
}
