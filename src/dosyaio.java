
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dosyaio {

	public static void main(String[] args) throws IOException { // Herhangi bir sorun olduğunda bu exception fırlatılabilir.
		
		File f = new File("C:\\Users\\vıctus\\Desktop\\deneme.txt");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write("Alperen\n");
		bWriter.write("Aksu");
		
		bWriter.close();
		fWriter.close();
		
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
		
		for(String d: satirlar) {
			System.out.println(d);
		}

	}

}
