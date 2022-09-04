import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        // Input user
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");

        var angka = input.nextDouble();
        input.close();
        
        // Check angka dalam range
        if(angka < Long.MIN_VALUE || angka > Long.MAX_VALUE) {
            System.out.println(angka + " can't fitted anywhere");
        }else {
            System.out.println(angka + " can be fitted in: ");
            if(angka > Byte.MIN_VALUE && angka < Byte.MAX_VALUE) {
                System.out.println("Byte");
            }
            if(angka > Short.MIN_VALUE && angka < Short.MAX_VALUE) {
                System.out.println("Short");
            }
            if(angka > Integer.MIN_VALUE && angka < Integer.MAX_VALUE) {
                System.out.println("Integer");
            }
            if(angka > Long.MIN_VALUE && angka < Long.MAX_VALUE) {
                System.out.println("Long");
            }
        }
    }
}
