
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosyacsv {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\vıctus\\Desktop\\deneme2.csv");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write("9;8;7\n");
		bWriter.write("6;5;4\n");
		
		bWriter.close();
		fWriter.close();
		
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		Scanner scanner = new Scanner(f);
		
		String satir;
		String[] sayilar;
		
		while(scanner.hasNextLine()) {
			satir = scanner.nextLine();
			sayilar = satir.split(";"); // ; ile bölerek array haline getirir.
			for(String d: sayilar) {
				System.out.println(d);
			}
		}
		
		bReader.close();
		fReader.close();
		
		

	}

}
