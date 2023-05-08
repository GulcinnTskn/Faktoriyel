//Java ile kombinasyon hesaplayan program yazınız.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faktöriyel Formülü  n! = 1 * 2 * 3 * ... * n

        // Kombinasyon Formülü C(n,r) = n! / (r! * (n-r)!)

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz : ");
        int n = input.nextInt();
        int nFaktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }

        System.out.print("r değerini giriniz : ");
        int r = input.nextInt();
        int rFaktoriyel = 1;

        for (int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }

        //n-r faktoriyel
        int n_r_fkt = n - r ;
        int eksiFk = 1;

        for (int i = 1; i <= n_r_fkt; i++) {
            eksiFk = eksiFk * i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * eksiFk);

        System.out.print("Kombinasyon : " + kombinasyon);

    }
}