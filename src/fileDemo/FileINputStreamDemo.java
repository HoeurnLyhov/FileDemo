package fileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileINputStreamDemo {

	public static void main(String[] args) {
		try 
		{
			int ch=-1;//ch=-1 because of haski value -1 is null value it mean doesn't have value is the end of the file
			FileInputStream fis=new FileInputStream("D:\\test\\A\\1.txt");
			//System.out.println("File opened sucessful");
			try {
				while((ch=fis.read())!=-1)
				{
					System.out.println((char)ch+" : "+ch);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
