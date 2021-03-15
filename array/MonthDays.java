import java.util.Scanner;

//pide un número de mes al usuario y muestra los días que tiene ese mes
//proceso se repite hasta que el número sea menor a 1 ó mayor a 12
//el número es de tipo int

public class MonthDays{
	
	public static void main(String args[]){
		
		ask_AndShowDaysOf_();
	}
	
	public static void ask_AndShowDaysOf_(){
		
		Scanner askNum= new Scanner(System.in);
		int[] monthDays= {31, 28, 30};
		int num= 0;

		System.out.print("Introduzca el número de un mes: ");
		num= askNum.nextInt();

		while (!_isAMonth(num)){
			
			showDaysOf_AccordTo_(monthDays, num);
			
			System.out.print("\nIntroduzca el número de un mes " + "o cualquier otro número para salir: ");
		    num= askNum.nextInt();
		}
	}
	
	public static void showDaysOf_AccordTo_(int[] daysList, int num){
		
		switch (num){
			
			case 1: System.out.println("Enero tiene " + daysList[0] + " días"); break;
			
			case 2: System.out.println("Febrero tiene " + daysList[1] + " días y 29 en año bisiesto"); break;
			
			case 3: System.out.println("Marzo tiene " + daysList[0] + " días"); break;
			
			case 4: System.out.println("Abril tiene " + daysList[2] + " días"); break;
			
			case 5: System.out.println("Mayo tiene " + daysList[0] + " días"); break;
			
			case 6: System.out.println("Junio tiene " + daysList[2] + " días"); break;
			
			case 7: System.out.println("Julio tiene " + daysList[0] + " días"); break;
			
			case 8: System.out.println("Agosto tiene " + daysList[0] + " días"); break; 
			
			case 9: System.out.println("Septiembre tiene " + daysList[2] + " días"); break; 
			
			case 10: System.out.println("Octubre tiene " + daysList[0] + " días"); break; 
			
			case 11: System.out.println("Noviembre tiene " + daysList[2] + " días"); break; 
			
			default: System.out.println("Diciembre tiene " + daysList[0] + " días"); break; 
		}
	}
	
	public static boolean _isAMonth(int num){
		
		return num < 1 || num > 12;
	}
}
