import java.util.Scanner;
public class Main {        
    public static void main(String[] args) {
        System.out.println("== Program Perhitungan Volume Tabung ==");
        Scanner input = new Scanner(System.in);
             double hasil1, hasil2, d, t;
             double phi = 3.14;
       
        System.out.print("Masukkan Angka Diameter : ");
             d = input.nextDouble();
        System.out.print("Masukkan Angka Tinggi : ");
             t = input.nextDouble();
       
        hasil2 = d / 2;
        hasil1 = (phi * hasil2 * hasil2 * t);
       
        System.out.println("Volume tabung adalah : " + hasil1);
    }
}