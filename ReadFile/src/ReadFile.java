import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("../content.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			System.out.println("Total file size to read :" + fis.available());
			
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
