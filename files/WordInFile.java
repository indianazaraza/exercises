import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class WordInFile{
	
	public void askDataToSearch(){
		
		Scanner askNameNWord= new Scanner(System.in);
		String fileName, wordToSearch;
		
		System.out.print("Introduzca el nombre del fichero: ");
		fileName= askNameNWord.nextLine();
		
		System.out.print("Palabra a buscar: ");
		wordToSearch= askNameNWord.nextLine();
		
		askNameNWord.close();
		
		search_In_Lines(wordToSearch, fileName);
		
	}
	
	public void search_In_Lines(String wordToSearch, String fileName){
		
		try{
			
			BufferedReader fileToRead= new BufferedReader(new FileReader(fileName + ".txt"));
			
			String lineOfText= "";
			
			while ((lineOfText= fileToRead.readLine()) != null){
				
				get_WhereThe_Appears(lineOfText, wordToSearch);
			}
			
			fileToRead.close();
			
		}catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
	
	public void get_WhereThe_Appears(String lineOfText, String wordToSearch){
		
		if (positionOf_In_(wordToSearch, lineOfText) >= 0){
			
			System.out.println(lineOfText);
		}
	}
	
	public int positionOf_In_(String wordToSearch, String lineOfText){
		
		return lineOfText.indexOf(wordToSearch);
	}
}
