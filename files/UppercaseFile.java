import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

class UppercaseFile{
	
	public void transformContent_ToUppercaseIn_(String fileName1, String fileName2){
		
		try{
			
			BufferedReader fileToCopy= new BufferedReader(new FileReader(fileName1 + ".txt"));
		    BufferedWriter fileToWrite= new BufferedWriter(new FileWriter(fileName2 + ".txt"));
		    
		    String fileContentAlreadyRead= "";
		    
		    while ((fileContentAlreadyRead= fileToCopy.readLine()) != null){
				
				fileToWrite.write(fileContentAlreadyRead.toUpperCase());
				
				fileToWrite.newLine();
			}
			
			fileToWrite.close();
			fileToCopy.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
}
