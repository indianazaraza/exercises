import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

class FileBinToFileText{
	
	public void transfer_To_(String fileBin, String fileTxt){
		
		try{
			
			FileInputStream fileBinToRead= new FileInputStream(fileBin + ".bin");
			BufferedWriter fileToWrite= new BufferedWriter(new FileWriter(fileTxt + ".txt"));
			
			int fileChar;
			
			String lineOfText= "";
			
			while ((fileChar= fileBinToRead.read()) == -1){
				
				if (thereAreCharPrintInThe_(fileChar)){
					
					lineOfText= (char) fileChar + "";
				
				    fileToWrite.write(lineOfText);	
				}
			}
			
			fileBinToRead.close();
			fileToWrite.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}

	public boolean thereAreCharPrintInThe_(int fileChar){
		
		return rangeOf_between_N_OrEquals_(fileChar, 97, 122, 32);
	}
	
	public boolean rangeOf_between_N_OrEquals_(int fileChar, int num1, int num2, int num3){
		
		return rangeOf_between_N_(fileChar, num1, num2)|| fileChar == num3;
	}
	
	public boolean rangeOf_between_N_(int fileChar, int num1, int num2){
		
		return fileChar >= num1 && fileChar <= num2;
	}
}
