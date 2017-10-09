package Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PreserveAndRead {

	public static void main(String[] args) {
		Student s1 = new Student(100, "ABC");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\A\\hello.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
