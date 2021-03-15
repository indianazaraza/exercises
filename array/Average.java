import java.util.Scanner;

public class Average{

	public static void main(String args[]){

		calculateAvgNMaxValOfList();
	}

	public static void calculateAvgNMaxValOfList(){
		/*
		 * calculates the average and maximum values of a list of double numbers
		 * the list has 5 positions
		 * */
		double[] numList= new double [5];
		
		ask_(numList);
		
		System.out.println("\nEl promedio de la lista es: " + avgOf_(numList) + "\n");
		
		calculateMaxValOf_(numList, avgOf_(numList));
	}

	public static void ask_(double[] numList){
		//ask the user five numbers,  
		//the list has 5 positions
		//the numbers are double type
		Scanner askNum= new Scanner(System.in);
		
		System.out.print("Introduzca 5 números: ");

		for (int beginNum= 0; beginNum < 5; beginNum++){

			numList[beginNum]= askNum.nextInt();

		}
		
		askNum.close();
	}

	public static double avgOf_(double[] numList){
		//calculates the average of the received list of type double 
		//the list has 5 positions
		//returns a double num
		int addNumList= 0;
		
		for (int beginNum= 0; beginNum < 5; beginNum++){

			addNumList += numList[beginNum];
		}
		
		return addNumList / 5;
	}
	
	public static void calculateMaxValOf_(double[] numList, double avg){
		//calculates which values are greater than or equal to 
		//the average received from a received list
		//the list must have 5 positions
		
		System.out.print("Valores por encima de la media son: ");

		for (int beginNum= 0; beginNum < 5; beginNum++){

			print_GreatOrEqualToThe_(numList[beginNum], avg);
		}

		System.out.println("");
	}

	public static void print_GreatOrEqualToThe_(double elemOfList, double avg){
		/*
		 * displays an item from the list greater than or equal to the average on the screen
		 * 
		 * */
		if (elemOfList >= avg){

			System.out.print(elemOfList + ", ");

		}
	}
}
