import java.util.Scanner;

public class FibonacciMarmut {
    static int hitungMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungMarmut(bulan - 2) + hitungMarmut(bulan - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bulan: ");
        int bulan = sc.nextInt();

        int totalMarmut = hitungMarmut(bulan);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + totalMarmut);

        sc.close();
    }
}
//afifah14