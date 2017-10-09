import java.io.File;


public class DeleteFileFolder {

	public static void main(String[] args) {
		File folder=new File("D:\\test\\A");
//		File file=new File("D:\\test\\1.txt");
		File f[]=folder.listFiles();
		String path="";
		for(int i=0;i<f.length;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f[i].delete();
		}
//		file.delete();
		folder.delete();
		System.out.println("File deleted...");

	}

}
