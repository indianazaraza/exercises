public class MatrixWithX{
	
	public static void main(String args[]){
		
		printMatrixWithX();
	}
	
	public static void printMatrixWithX(){
		//displays a 5x5 matrix with. and an x ​​
		//where the index of the row and the column are equal
		char[][] matrixChar= new char[5][5];
		
		saveDataInThe_(matrixChar);
		
		showForScreen_(matrixChar);
	}
	
	public static char _equalsTo_(int num1, int num2){
		/*
		 * compares two numbers of type int for equality
         * receives two numbers of type int
         * returns a character
		 * */
		
		return (num1 == num2)? 'X': '.';
	}
	
	public static void saveDataInThe_(char[][] matrixChar){
		//enter the data into the matrix
		//the matrix must be 5x5  
		//receives by parameter a matrix of character type
		
		for (int index= 0; index < 5; index++){
			
			for (int index2= 0; index2 < 5; index2++){
				
				matrixChar[index][index2]= _equalsTo_(index, index2);
			}
		}
	}
	
	public static void showForScreen_(char[][] matrixChar){
		// print an array of characters on the screen
		// the matrix must be 5x5  
		// receives by parameter a matrix of character type
		
		for (int index= 0; index < 5; index++){
			
			for (int index2= 0; index2 < 5; index2++){
				
				System.out.print(matrixChar[index][index2] + " ");
			}
			
			System.out.println();
		}
	}
}
