import java.util.Scanner;

public class CekPrimaRekursif14 {
    static boolean PrimaRekursif(int n, int divisor) {
        if (n <= 1) {
            return false;
        } else if (divisor == 1) {
            return true;
        } else {
            return (n % divisor != 0) && PrimaRekursif (n, divisor - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int num = sc.nextInt();

        if (PrimaRekursif(num, num / 2)) {
            System.out.println(num + " adalah bilangan prima.");
        } else {
            System.out.println(num + " bukan bilangan prima.");
        }

        sc.close();
    }
}
//afifah14