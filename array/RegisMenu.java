import java.util.Scanner;

//el usuario tiene 2 opciones: añadir un dato al array (llevando la cuenta de cuántos hay) o comprobar si existe algún dato 
//los datos son de tipo int
//tamaño límite del array es 1000

public class RegisMenu{
	
	public static void main(String args[]){
		
		Scanner askNum= new Scanner(System.in);
		int[] numList= new int[1000]; //valor por defecto en cualquier posición es 0 al no ingresar ningún otro valor
		int dataLength; 
	
		System.out.println("¿Cuántos datos desea añadir?");
		dataLength= askNum.nextInt();
		
		System.out.print("\nAgregue los datos dejando un espacio: ");
		
		AddNewDataTo_AccordTo_(numList, dataLength);
		
		askNum.close();
	}
	
	public static void AddNewDataTo_AccordTo_(int[] numList, int dataLength){
		
		Scanner askNum= new Scanner(System.in);
		int numToSearch= 0;
		char answer;
		
		for (int i= 0; i < dataLength; i++){
			
			numList[i]= askNum.nextInt();	
		}
		
		System.out.println("\nActualmente quedan " + (1000-dataLength) + " lugares en el registro\n");
		
		System.out.println("¿Desea buscar algún número? [S/n]");
		answer= askNum.next().charAt(0);
		
		Search_OnThe_AccordTo_(numToSearch, numList, answer);

		askNum.close();
	}
	
	public static void Search_OnThe_AccordTo_(int numToSearch, int[] numList, char answer){
		
		Scanner askNum= new Scanner(System.in);
		
		if (answer == 's'){
			
			System.out.print("\nIngrese el dato a buscar: ");
		    numToSearch= askNum.nextInt();
		    
			showMessageAccord_(numTimesThat_AppearsIn_(numToSearch, numList));
		}

		askNum.close();
	}
	
	public static int _equalsTo_(int numToSearch, int elem){
		
		return (numToSearch == elem)? 1 : 0;
	}
	
	public static int numTimesThat_AppearsIn_(int numToSearch, int[] numList){
		
		int countOfElem= 0;
		
		for (int i= 0; i < 1000; i++){
			
			countOfElem += _equalsTo_(numToSearch, numList[i]);
		}
		
		return countOfElem;
	}
	
	public static void showMessageAccord_(int num){
		
		if (num > 0){
			
			System.out.println("\nTu número aparece en la lista");
			
		} else{
			
			System.out.println("\nTu número no aparece en la lista");
		}
	}
}
	
