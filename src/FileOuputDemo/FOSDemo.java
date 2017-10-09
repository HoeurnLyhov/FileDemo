package FileOuputDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSDemo
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		try {
			
			FileOutputStream fos=new FileOutputStream("D:\\test\\A\\Demo.txt");
			System.out.println("Enter you name");
			String name=s.nextLine();
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("Sucess... ");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
