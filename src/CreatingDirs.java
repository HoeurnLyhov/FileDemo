import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreatingDirs {

	public static void main(String[] args) {
		char ch='A';
		String str="D:\\test\\";
		for(int i=0;i<26;i++)
		{
			str+=ch;
			str+="\\";
			ch++;
		}
		File folder=new File(str);
		
		if(folder.exists())
		{
			System.out.println("Exists....");
		}
		else
		{
			folder.mkdirs();
			System.out.println("Folder created////");
			
			
		}

	}

}
