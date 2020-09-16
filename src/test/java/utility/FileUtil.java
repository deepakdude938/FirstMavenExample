package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtil {
	
	public static String getproperty() {
		try {
		FileInputStream fis=new FileInputStream("C:\\exa\\java programs\\FirstMaven\\src\\test\\resources\\ObjectRepository.properties");
		}
		catch(FileNotFoundException e) {
			
		}
		return  "ad";
	}

}
