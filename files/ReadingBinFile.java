import java.io.FileInputStream;
import java.io.IOException;

class ReadingBinFile{
	
	public void showContentFileBin(String fileName){
		
		try{
			
			FileInputStream fileBinToRead= new FileInputStream(fileName + ".bin");
			
			int fileCharacter;
			
			while ((fileCharacter= fileBinToRead.read()) != -1){
				
				printCharOf_(fileCharacter);
			}
			
			fileBinToRead.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
	
	public void printCharOf_(int fileCharacter){
		
		if (thereAreCharPrintInThe_(fileCharacter)){
			
			System.out.print((char)fileCharacter);
		}
	}
	
	public boolean thereAreCharPrintInThe_(int fileCharacter){
		
		return rangeOf_between_N_OrEquals_(fileCharacter, 97, 122, 32);
	}
	
	public boolean rangeOf_between_N_OrEquals_(int fileCharacter, int num1, int num2, int num3){
		
		return rangeOf_between_N_(fileCharacter, num1, num2) || fileCharacter == num3;
	}
	
	public boolean rangeOf_between_N_(int fileCharacter, int num1, int num2){
		
		return fileCharacter >= num1 && fileCharacter <= num2;
	}
}
