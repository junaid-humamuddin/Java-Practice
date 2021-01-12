package zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SplitTest {
	public static void main(String[] args) throws IOException {
		String fileNameWithExtension = "minecraft.exe";
		String extension = fileNameWithExtension.split("[.]")[1];
		String filename = fileNameWithExtension.split("[.]")[0];
		File temp = File.createTempFile(filename, "." + extension);
		System.out.println(temp);
		byte[] bytesArray = new byte[(int) temp.length()];

		FileInputStream fis = new FileInputStream(temp);
		fis.read(bytesArray); // read file into bytes[]
		fis.close();
	}

}
