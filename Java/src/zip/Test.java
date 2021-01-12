package zip;

import java.io.IOException;
import java.io.InputStream;

public class Test {
	private static final int BUFFER_SIZE = 8192;

	private static void extractEntry(InputStream is) throws IOException {

		try {

			final byte[] buf = new byte[BUFFER_SIZE];
			int read = 0;
			int length;
			while ((length = is.read(buf, 0, buf.length)) >= 0) {

			}
		} catch (IOException ioex) {

		}
	}

}
