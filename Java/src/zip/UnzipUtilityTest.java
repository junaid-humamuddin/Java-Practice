package zip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class UnzipUtilityTest {
	public static void main(String[] args) throws IOException {
	    ZipFile zipFile = new ZipFile("f:/DD577.zip");

	    Enumeration<? extends ZipEntry> entries = zipFile.entries();

	    while(entries.hasMoreElements()){
	        ZipEntry entry = entries.nextElement();
	        System.out.println(entry);
	        InputStream stream = zipFile.getInputStream(entry);
	        try
	        {
	            String line;
	            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( stream ) );
	            File file = new File("F://testFile1.txt");
            	FileWriter writer = new FileWriter(file);
	            while( (line = bufferedReader.readLine()) != null )
	            { 
	            	
	            	writer.write(line);
	                System.out.printf("%s\n", line);
	            }  
	        } 
	        catch( IOException e )
	        {
	            System.err.println( "Error: " + e );
	        }
	    }
	}
}
