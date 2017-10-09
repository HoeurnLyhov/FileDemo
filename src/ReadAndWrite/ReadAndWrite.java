package ReadAndWrite;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) {
		byte b[] = new byte [300];
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\test\\A\\1.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\test\\A\\Demo.txt"));
			
			bis.read(b);
			bos.write(b);
			
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
