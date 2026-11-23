
import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int nt[] = new int[4];
        int jumlah = 0;

        for (int i = 0; i < nt.length; i++) {
            nt[i] = hi.nextInt();
            jumlah += nt[i];

            System.out.print("Indeks " + i + ": ");
            System.out.println(jumlah);
        }

        int total = jumlah;
        System.out.println("total: " + total);
    }
}
