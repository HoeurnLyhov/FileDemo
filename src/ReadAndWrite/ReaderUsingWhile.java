package ReadAndWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderUsingWhile {

	public static void main(String[] args) {
		char ch[] = new char [300];
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\test\\A\\1.txt"));
			
			int c;
			while((c = br.read()) != -1)
			{
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
