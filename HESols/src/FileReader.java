import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * @author AKareer
 *
 */
public class FileReader {

	public static void giveFileReaderHandle(String filepath){
	
		try{
			File file = new File("test.txt");
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
