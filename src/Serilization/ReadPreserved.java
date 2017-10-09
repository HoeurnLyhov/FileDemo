package Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPreserved {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\test\\A\\lyly.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s=(Student)ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
