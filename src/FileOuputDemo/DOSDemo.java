package FileOuputDemo;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DOSDemo {

	public static void main(String[] args) {
		String name;
		Scanner s = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\A\\Demo.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			System.out.println("Enter name: ");
			name=s.nextLine();
			byte b[]=name.getBytes();
			
			dos.write(b);
			
			dos.close();//BufferedOutputStream we need to close the file
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
