import java.util.Scanner;

//pide 8 números al usuario, los guarda en un array y calcula cuál es el valor máximo y mínimo 
//los números son de tipo int

public class MaxMinArray{

	public static void main(String args[]){

		showValMinAndMay();
	}
	
	public static void showValMinAndMay(){
		
		int[] numList= new int[8];
		
		saveValOf_(numList);
		
		showMayAndMinNumOf_(numList);
	}
	
	public static void saveValOf_(int[] numList){
		
		Scanner askNum= new Scanner(System.in);
		
		System.out.print("Introduzca 8 números: ");

		for (int beginNum= 0; beginNum < 8; beginNum++){

			numList[beginNum]= askNum.nextInt();
		}

		askNum.close();

	}
	
	public static void showMayAndMinNumOf_(int[] numList){

		int mayValue= numList[0];

		int minValue= numList[0];

		for (int beginNum= 0; beginNum < 8; beginNum++){

			if (mayValue < numList[beginNum]) mayValue= numList[beginNum];

			if (minValue > numList[beginNum]) minValue= numList[beginNum];
		}

		System.out.println("El número más grande de la lista es: " + mayValue + " y " + "el número más pequeño es: " + minValue);
	}
}
