package Day9.demo;
import java.util.*;
/*
 * BufferedInputStream	
A BufferedInputStream adds functionality to another input stream-namely, 
the ability to buffer the input and to support the mark and reset methods.
BufferedOutputStream	
The class implements a buffered output stream.
BufferedReader	
Reads text from a character-input stream, 
buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("Abc.txt");

		BufferedInputStream readbin = new BufferedInputStream(fin);
		
		FileOutputStream out = new FileOutputStream("output_Krish.txt");

		int i;

		while ((i = readbin.read()) != -1) {

			out.write(i);

		}

		fin.close();

		readbin.close();

		
	}

}

