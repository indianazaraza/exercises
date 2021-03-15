import java.util.Scanner;

//pide al usuario 10 números, luego pregunta cuál quiere buscar y dice si ese está o no en el array
//los números son de tipo long

public class NumRegister{

	public static void main(String args[]){

		Scanner askNum= new Scanner(System.in);
		long[] numList= new long[10];
		long numToSearch= 0;

		System.out.print("Introduzca 10 números: ");
		
		for (int beginNum= 0; beginNum < 10; beginNum++){

			numList[beginNum]= askNum.nextLong();
		}
	
		repeatSearchOf_OnThe_(numToSearch, numList);	
	}
	
	public static long numberTimesThat_IsEqualTo_(long numToSearch, long elem){
		
		return (numToSearch == elem)? 1: 0;
	}

	public static long numberTimesThat_AppearsInThe_(long numToSearch, long[] numList){
		
		int i= 0;
		
		long countOfElem= 0;
		
		while (i < 10){
			
			countOfElem += numberTimesThat_IsEqualTo_(numToSearch, numList[i]);
				
			i++;
		}
		
		return countOfElem;
	}
	
	public static void showMessageAccord_(long numTimes){
		
		if (numTimes > 0){
			
			System.out.println("Tu número está en la lista");	
		
		}else{
			
			System.out.println("Tu número no está en la lista");
		}
	}
	
	public static void repeatSearchOf_OnThe_(long numToSearch, long[] numList){
		
		Scanner askNum= new Scanner(System.in);
		
		System.out.print("\nIntroduzca un número a buscar o -1 para salir: ");
		numToSearch= askNum.nextLong();
		
		if (numToSearch != -1){
			
			showMessageAccord_(numberTimesThat_AppearsInThe_(numToSearch, numList));
			
			repeatSearchOf_OnThe_(numToSearch, numList);
		}
	}
}
