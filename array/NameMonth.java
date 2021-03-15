import java.util.Scanner;

//pide un número de un mes al usuario y muestra el nombre del mes correspondiente a ese número
//el número es de tipo int

public class NameMonth{

	public static void main(String args[]){

		Scanner askNum= new Scanner(System.in); 
		String[] monthNameList= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; 
		int numMonth;

		System.out.print("Introduzca un número de un mes: ");
		numMonth= askNum.nextInt();

		showNameMonthOf_AccordTo_(monthNameList, numMonth)
	}

	public static void showNameMonthOf_AccordTo_(String[] monthList, int num){

		if (num < 1 || num > 12){

			System.out.println("\nTu número no corresponde a un mes")

		}else{

			System.out.println("\nTu número corresponde al mes de: " + monthList[num - 1]);	
		
		}
	}
}