import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {
        double boy,vke;
        int kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lutfen kilonuzu kg cinsinden giriniz : ");
        kilo = inp.nextInt();

        vke = kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz : "+vke);

    }
}
