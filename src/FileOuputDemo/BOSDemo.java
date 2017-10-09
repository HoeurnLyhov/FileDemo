package FileOuputDemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BOSDemo {

	public static void main(String[] args) {
		String name;
		Scanner s = new Scanner(System.in);
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\A\\Demo.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			System.out.println("Enter name: ");
			name=s.nextLine();
			byte b[]=name.getBytes();
			
			bos.write(b);
			
			bos.close();//BufferedOutputStream we need to close the file
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
