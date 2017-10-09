package fileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISUsingByteArray {

	public static void main(String[] args) {
		String str;
		byte b[]=new byte[500];//you can read only 500 if more than it you can change value
		try {
			FileInputStream fis=new FileInputStream("D:\\test\\A\\1.txt");
			try {
				fis.read(b);
				str=new String(b);
				System.out.println(str.trim());// trim(); use to delete the box and space of data create;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
