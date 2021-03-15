public class SecndRowOfA{

//rellena una matriz de carácteres de 5x5 con '.', excepto la segunda fila que la llena con 'A'
	
	public static void main(String args[]){
		
		//first way
		/*char[][] matrixChar= {{'.', '.', '.', '.', '.'}, //00-04
							{'A', 'A', 'A', 'A', 'A'}, //10-14
							{'.', '.', '.', '.', '.'}, //20-24
							{'.', '.', '.', '.', '.'}, //30-34
							{'.', '.', '.', '.', '.'}};	//40-44
		
		
		showForScreen_(matrixChar);*/
		//second way
		showMatrixWithSndRowOfA();			
	}
	
	public static char _equalsTo_(int num1, int num2){
		//compara la igualdad entre dos números 
		//recibe por parámetros dos números de tipo int
		//retorna un caŕacter 
		
		return (num1 == num2)? 'A': '.';
	}
	
	public static void showMatrixWithSndRowOfA(){
		//guarda datos e imprime por pantalla una matriz de carácteres 
		//recibe por parámetro una matriz de carácteres
		char[][] matrixChar= new char[5][5];
		
		saveDataInThe_(matrixChar);
		
		showForScreen_(matrixChar);
	}
	
	public static void saveDataInThe_(char[][] matrixChar){
		//guarda datos en la matriz 
		//recibe por parámetro una matriz de carácteres
		
		for (int index= 0; index < 5; index++){
			
			for (int index2= 0; index2 < 5; index2++){
				
				matrixChar[index][index2]= _equalsTo_(index, 1); 
			}
		}
	}
	
	public static void showForScreen_(char[][] matrixChar){
		//imprime la matriz por pantalla 
		//recibe por parámetro una matriz de carácteres
		
		for (int index= 0; index < 5; index++){
			
			for (int index2= 0; index2 < 5; index2++){
				
				System.out.print(matrixChar[index][index2] + " ");
			} 
			
			System.out.println("");
		}
	}
}
