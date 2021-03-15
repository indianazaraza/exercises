import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class FilesToWrite{

/*
 * Pide al usuario que escriba unas frases en un archivo .txt 
 * */	
	
	public void writeToNewFile(String fileName){
		
		Scanner askText= new Scanner(System.in);
		String lineOfText= "";
		
		System.out.println("Escriba algunas frases hasta escribir fin: ");
		
		try{
			//crea el nuevo archivo testFile.txt
			BufferedWriter userFile= new BufferedWriter(new FileWriter(new File(fileName + ".txt")));
			
			while (! lineOfText.equalsIgnoreCase("fin")){
			//hasta que el usuario escriba "fin" en una nueva línea el programa no termina 		
				lineOfText= askText.nextLine();
				
				userFile.write(lineOfText);
				
				userFile.newLine();
			}
			
			userFile.close();
				
		} catch (IOException errorFile){
			
			System.out.println(errorFile.getMessage());
		}
	}
}
