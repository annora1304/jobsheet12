import java.util.Scanner;
public class Modifikasi1 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print(1); 
            return 1;
        } else {
            int hasil = x * hitungPangkat(x, y - 1);
            System.out.print(x + " * "); 
            return hasil;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.print(bilangan + "^" + pangkat + " = ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);

        sc.close();
    }
}