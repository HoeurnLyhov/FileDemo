package fileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISUsingOffset {

	public static void main(String[] args) {
		String str;
		byte b[]=new byte[500];//you can read only 500 if more than it you can change value
		try {
			FileInputStream fis=new FileInputStream("D:\\test\\A\\1.txt");
			try {
				
				fis.read(b,0,5);// 0,5 it mean start from 0 and the end is 5
				str=new String(b);
				System.out.println(str);
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
