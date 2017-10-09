package Stream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadingDIS {

	public static void main(String[] args) {
		byte b[]=new byte [100];
		try {
			DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\test\\A\\1.txt")));
			try {
				dis.read(b);
				String str=new String(b);
				System.out.println(str.trim());
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
