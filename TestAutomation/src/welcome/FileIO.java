package welcome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void main(String[] args) {
		FileIO fio = new FileIO();
		fio.write();
		fio.read();
	}
	
	// file creat and write ..
	public void write() {
		File myFile = new File("TestFile.txt");
		
		try {
			FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
			
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("Test Automation");
			
			bw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read() {
		File myFile = new File("TestFile.txt");
		
		try {
			FileReader fr = new FileReader(myFile.getAbsolutePath());
			
			BufferedReader br = new BufferedReader(fr);
			
			
			// for single line read..
//			String line = br.readLine();
//			System.out.println(line);
//			
			
			// for all file read..
			
			String line = null;
			while ((line = br.readLine()) != null) {
				
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
