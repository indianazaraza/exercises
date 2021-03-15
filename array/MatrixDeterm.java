import java.util.Scanner;

//pide 9 números al usuario, los guarda en una matriz 3x3 y calcula la determinante
//la determinante se calcula usando la regla de saurrus
//los números son de tipo int

public class MatrixDeterm{
	
	public static void main(String args[]){
		
		System.out.println("\nLa determinante de la matriz es: " + determOfTheMatrix());
	}
	
	public static int determOfTheMatrix(){
		/*
		 * calculate the determinant of the matrix of type int
		 * returns a determinant type int
		 * */
		int[][] matrixNum= new int[3][3];
		
		saveDataInThe_(matrixNum);
		
		return positSetOfThe_(matrixNum) - negatSetOfThe_(matrixNum);
	}
	
	public static int positSetOfThe_(int[][] matrixNum){
		/*
		 * add three positive sets of the matrix
		 * receives as parameter the size of the matrix of type int
		 * returns a positive set value of the matrix
		 * */
		return firstpositSetOfThe_(matrixNum) + sndPositSetOfThe_(matrixNum) + thdPositSetOfThe_(matrixNum);
	}
	
	public static int negatSetOfThe_(int[][] matrixNum){
		/*
		 * add three negative sets of the matrix
		 * receives as parameter the size of the matrix of type int
		 * returns a negative set value of the matrix
		 * */
		return firstNegatSetOfThe_(matrixNum) + sndNegatSetOfThe_(matrixNum) + thdNegatSetOfThe_(matrixNum);
	}
	
	public static int thdPositSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the third positive set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[2][0] * matrixNum[0][1] * matrixNum[1][2];
	}
	
	public static int sndPositSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the second positive set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[1][0] * matrixNum[2][1] * matrixNum[0][2];
	}
	
	public static int firstpositSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the first positive set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[0][0] * matrixNum[1][1] * matrixNum[2][2];
	}
	
	public static int thdNegatSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the third negative set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[2][2] * matrixNum[0][1] * matrixNum[1][0];
	}
	
	public static int sndNegatSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the second negative set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[1][2] * matrixNum[2][1] * matrixNum[0][0];
	}
	
	public static int firstNegatSetOfThe_(int[][] matrixNum){
		/*
		 * multiply the first negative set of the received matrix
		 * returns a number of type int
		 * */
		return matrixNum[0][2] * matrixNum[1][1] * matrixNum[2][0];
	}
	
	public static void saveDataInThe_(int[][] matrixNum){
		/*
		 * input data into a 3x3 matrix
		 * receives as parameter the size of the matrix of type int
		 * */
		Scanner askNum= new Scanner(System.in);
		
		System.out.print("Introduzca 9 números espaciados: ");
		
		for (int index= 0; index < 3; index++){
			
			for (int index2= 0; index2 < 3; index2++){
				
				matrixNum[index][index2]= askNum.nextInt();	
				
			}
		}
		
		askNum.close();
	}
}
