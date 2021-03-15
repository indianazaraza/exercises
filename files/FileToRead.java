import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

class FileToRead{
	
	public void showFileContent(){
		
		Scanner askFileName= new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del archivo: ");
		String fileName= askFileName.nextLine();

		askFileName.close();
		
		try {
			
			BufferedReader fileContent= new BufferedReader(new FileReader(fileName + ".txt"));

			System.out.println();
			
			String fileContentAlreadyRead= "";
			
			//Optional<BufferedReader> fileContentAlreadyRead= Optional.ofNullable(fileContent);
			//attempt to remove null from the loop
			
			while ((fileContentAlreadyRead= fileContent.readLine()) != null){
				
				System.out.println(fileContentAlreadyRead);
				
			}
			
			fileContent.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
}
