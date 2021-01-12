package zip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileReader {
	private static final String FILE_NAME = "F:/DD577.zip";
	private static final String OUTPUT_DIR = "F:/";
	private static final int BUFFER_SIZE = 8192;

	public static void main(String args[]) throws IOException { // Prefer ZipFile over ZipInputStream
		// readUsingZipFile();
		readUsingZipInputStream();
	}

	private static void readUsingZipInputStream() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(FILE_NAME));
		final ZipInputStream is = new ZipInputStream(bis);
		try {
			ZipEntry entry;
			while ((entry = is.getNextEntry()) != null) {
				System.out.printf("File: %s Size %d Modified on %TD %n", entry.getName(), entry.getSize(),
						new Date(entry.getTime()));
				extractEntry(entry, is);
			}
		} finally {
			is.close();
		}
	}

	private static void extractEntry(final ZipEntry entry, InputStream is) throws IOException {
		String exractedFile = OUTPUT_DIR + entry.getName();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(exractedFile);
			final byte[] buf = new byte[BUFFER_SIZE];
			int read = 0;
			int length;
			while ((length = is.read(buf, 0, buf.length)) >= 0) {
				//fos.write(buf, 0, length);
				System.out.println(buf);
			}
		} catch (IOException ioex) {
			fos.close();
		}
	}
}