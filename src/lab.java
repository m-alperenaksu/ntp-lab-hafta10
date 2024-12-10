// Kullanıcıdan alınan İsim-Soyisim kombinasyonunun CSV dosyasında olup olmadığını kontrol eden program.


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lab {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\vıctus\\Desktop\\lab.csv");
		if(!f.exists()) {
			System.out.println("Dosya yok!");
			return;
		}
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		Scanner scanner = new Scanner(f);
		
		ArrayList<String> satirlar = new ArrayList<String>();
		String satir;
		while(scanner.hasNextLine()) {
			satir = scanner.nextLine();
			satirlar.add(satir);
		}
		
		bReader.close();
		fReader.close();
		
		Scanner tScanner = new Scanner(System.in);
		System.out.println("İsminizi giriniz: ");
		String temp1 = tScanner.nextLine();
		System.out.println("Soyadınızı giriniz: ");
		String temp2 = tScanner.nextLine();
		
		String temp3 = temp1 + ";" + temp2;
		
		if(satirlar.contains(temp3)) {
			System.out.println("Kullanıcı girişi başarılı oldu.");
		}else {
			System.out.println("Kullanıcı girişi başarısız oldu.");
		}
		

	}

}
