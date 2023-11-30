import java.util.Scanner;

public class PenjumlahanRekursif {
    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        System.out.print("Deret Rekursif: ");
        printRecursiveSeries(f);

        System.out.println("\nPenjumlahan 1+2+...+" + f + " = " + sumRecursive(f));

        sc.close();
    }

    static void printRecursiveSeries(int n) {
        if (n > 0) {
            printRecursiveSeries(n - 1);
            System.out.print(n + " ");
        }
    }
}

//afifah14