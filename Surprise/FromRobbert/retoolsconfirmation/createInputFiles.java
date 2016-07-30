import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Writer;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * creates a file for each line in an input file with format id,comment
 * @author Robbert
 */
public class createInputFiles {

	String inputFile = "";//TODO here enter a file with format id,comment
	String[] nextline;
	String path = "";//TODO here enter a path for an output folder, in here all the files will be created
	
	public void create() throws FileNotFoundException, IOException {
		CSVReader reader = new CSVReader(new FileReader(inputFile));
		
		while ((nextline = reader.readNext()) != null) {
			Writer writer = new OutputStreamWriter(new FileOutputStream(path + nextline[0] + ".txt"));
			writer.write(nextline[1]);
			writer.close();
		}
		
		reader.close();
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		new createInputFiles().create();		
	}
}
