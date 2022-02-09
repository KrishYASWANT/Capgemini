package Day9.demo;
import java.io.FileOutputStream;
import java.util.*;

/*
 * FileReader	
Convenience class for reading character files.
FileWriter	
Convenience class for writing character files.
FilterInputStream	
A FilterInputStream contains some other input stream, which it uses as its basic source of data, 
possibly transforming the data along the way or providing additional functionality.
FilterOutputStream

 pls write on above api code

 
 
class FileReader
{
	
}
class FileWritter
{
	
}*/
public class FileWritterReader {

	public static void main(String[] args) {
		  
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output123.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);
            System.out.println(array);
            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
        
       
	}

}
