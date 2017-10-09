package ReadAndWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FRDemo {

	public static void main(String[] args) {
		char ch[] = new char [300];
		try {
			FileReader fr = new FileReader("D:\\test\\A\\1.txt");
			fr.read(ch);
			String n = new String(ch);
			System.out.println(n.trim());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
