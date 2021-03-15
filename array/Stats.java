import java.util.Scanner;

//pide al usuario 10 números, los guarda en un array y calcula la media, la varianza y la desviación típica
//los números son de tipo double 

public class Stats{
	
	public static void main(String args[]){
		
		showAvgVarAndTypDesvOfTheVector();
	}
	
	public static void showAvgVarAndTypDesvOfTheVector(){
		//calcula el promedio, la varianza y la desviación típica de un vector de 10 números
		//recibe por parámetro un vector de números de tipo double
		double[] numVector= new double[10];
		
		saveDataInThe_(numVector);
		
		System.out.printf("Calculo del promedio es: " + "%.2f %n", avgOf_(numVector));
		
		System.out.printf("Calculo de la varianza es: " + "%.2f %n", varOf_(numVector));
		
		System.out.printf("Calculo de la desviación típica es: " + "%.2f %n", Math.sqrt(varOf_(numVector)));
	}
	
	public static void saveDataInThe_(double[] numVector){
		
		//pide al usuario 10 números y rellena un vector 
		//recibe por parámetro un vector de números de tipo double
		
		Scanner askNum= new Scanner(System.in);
		
		System.out.print("Introduzca 10 números espaciados: ");
		
		for (int i= 0; i < 10; i++){
			
			numVector[i]= askNum.nextDouble();
		}

		askNum.close();
	}
	
	public static double avgOf_(double[] numVector){
		
		//calcula el promedio de un vector de 10 números
		//recibe por parámetro un vector de números de tipo double
		//retorna un número de tipo double
		
		double avgVector= 0;
		
		for (double elem: numVector){
			
			avgVector += elem / 10;
		}
		
		return avgVector; 
	}
	
	public static double varOf_(double[] numVector){
		
		//calcula la varianza de un vector de 10 números
		//recibe por parámetro un vector de números de tipo double
		//retorna un número de tipo double
		
		double sumOfElemSquared= 0;
		
		for (double elem: numVector){
			
			sumOfElemSquared += (elem * elem) / 10;
		}
		
		return sumOfElemSquared;
	}
}
