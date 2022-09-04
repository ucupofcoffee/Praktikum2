import java.util.Scanner;

public class Soal5 {
    public static String capitalize(String str) {
		//Kapitalisasi huruf pada index 0 di string
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static void main(String[] args) {
		//Dapatklan input user
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan string 1: ");
		String str1 = input.nextLine();
		System.out.println("Masukan string 2: ");
		String str2 = input.nextLine();
		input.close();
		//Mendapatkan jumlah dari panjang kedua string
		System.out.println(str1.length() + str2.length());
		//Check apakah string 1 secara leksikografis lebih besar dari string 2
		if(str1.compareTo(str2)>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		//Kapitaliasi huruf pertama
		System.out.println(capitalize(str1) + " " + capitalize(str2));
 	}
}
