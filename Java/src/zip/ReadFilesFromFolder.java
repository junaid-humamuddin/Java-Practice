package zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFilesFromFolder {

	public static void main(String[] args) {

		ReadFilesFromFolder readFiles = new ReadFilesFromFolder();
		final File folder = new File("F:\\DD577");
		try {
			readFiles.listFilesForFolder(folder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void listFilesForFolder(final File folder) throws IOException {

		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				String absFilePath = fileEntry.getAbsolutePath();
				
				try (InputStream in = new FileInputStream(absFilePath)) {
					byte[] bytes = toByteArrayFromInputStream(in);
					//Document inputPDF = new Document(bytes);
					/*String line;
					@SuppressWarnings("resource")
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
					while ((line = bufferedReader.readLine()) != null) {
						System.out.printf("%s\n", line);
					}*/
				} catch (IOException e) {
					System.err.println("Error: " + e);
				}

			}
		}

	}

	private byte[] toByteArrayFromInputStream(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int reads = is.read();
		while (reads != -1) {
			baos.write(reads);
			reads = is.read();
		}
		return baos.toByteArray();
	}

}
