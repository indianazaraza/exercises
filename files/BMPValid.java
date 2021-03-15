import java.io.IOException;
import java.io.FileInputStream;

class BMPValid{
	
	public int positionOfCharactersBMFrom_(String fileName){
		
		String charactersFile= "";
		
		try{
			
			FileInputStream fileBmpToRead= new FileInputStream(fileName + ".bmp");
			
			int byteOfFile, counter= 0;
			
			while (counter < 55){
				
				byteOfFile= fileBmpToRead.read();
				
				charactersFile+= (char) byteOfFile;
				
				counter++;
			}
			
			fileBmpToRead.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
		
		return charactersFile.indexOf("BM");
	}
	
	public String validationMessageOf_(String fileName){
		
		return positionOfCharactersBMFrom_(fileName) == 0? "Parece un BMP válido": "No es un BMP válido";
	}
}
