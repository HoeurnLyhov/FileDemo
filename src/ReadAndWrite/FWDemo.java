package ReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWDemo {

	public static void main(String[] args) {
		char ch[]=new char [300];
		Scanner s = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter("D:\\test\\A\\demo1.txt");
			System.out.println("Enter the text : ");
			fw.write(s.next().toCharArray());
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
