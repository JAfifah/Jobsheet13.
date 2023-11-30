import java.util.Scanner;

public class PenjumlahanRekursif {
    static int totRecursiveRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + totRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.print("Penjumlahan 1");
        for (int i = 2; i <= n; i++) {
            System.out.print("+" + i);
        }

        int result = totRecursive(n);

        System.out.println(" = " + result);

        sc.close();
    }
}
//Afifah14