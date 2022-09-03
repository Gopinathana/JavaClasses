package org.fileop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CretNewFile {
	static  int jn =10;
	
public static void main(String[] args) throws IOException {
	//Create a new Folder
	File file = new File("C:\\Users\\Bharath Kumar\\Desktop\\FileOperation");
//	boolean mkdir = file.mkdir();
//	System.out.println(mkdir);
	
	//Create a new File
	File file1 = new File("C:\\Users\\Bharath Kumar\\Desktop\\FileOperation\\excelFile.xlsx	");
//    boolean createNewFile = file1.createNewFile();
//    System.out.println(createNewFile);
	
	
    //Check weather we can able to read a file or not
    boolean canRead = file.canRead();
    System.out.println(canRead);
    
    
    //Check we can able to Write the file or not
    boolean canWrite = file1.canWrite();
    System.out.println(canWrite);
    
    //check weather the file is present or not
    boolean exists = file1.exists();
    System.out.println(exists);
   
    //check weather given location file or not
    boolean file2 = file.isFile();
    System.out.println(file2);
    
    
    //Check weather given location is directory or not
    boolean directory = file1.isDirectory();
    System.out.println(directory);
    
    
    //Print all files presents in folder
    String[] list = file.list();
    for (String string : list) {
		System.out.println(string);
	}
    
  //Print all files presents in folder
    
    File[] listFiles = file.listFiles();
    for (File file3 : listFiles) {
		System.out.println(file3);
    	
	}   
    
    FileReader fileReader= new FileReader(file);
    
    
    
    
    
    
    
    
}
}
