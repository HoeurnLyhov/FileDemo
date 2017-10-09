import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FilesDemo {

	public static void main(String[] args) {
		File file=new File("D:\\Mr.vikness\\3.txt");
		
		if(file.exists())
		{
			System.out.println("Exists....");
		}
		else
		{
			System.out.println("NA");
			int i=new Scanner(System.in).nextInt();
			try {
				if(i==1)
				{
				file.createNewFile();
				file.mkdir();
				System.out.println("File created....");
				}
			} catch (IOException e) {
				System.out.println("File Not created....");
				e.printStackTrace();
			}
		}
	}

}
