public class GeomFigures{

//dibuja un cuadrado de asteriscos de 3x3
	
	public static void main(String args[]){
		
		drawSquareOfAsterisks3X3();
	}
	
	public static void drawSquareOfAsterisks3X3(){
		
		//primera forma
		
		/*char[][] matrixAsterisks= {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
		
		for (char[] arrayAsterisks: matrixAsterisks){
			
			for (char elem: arrayAsterisks){
			
				System.out.print(elem + " ");
			}
		
			System.out.println(" ");
		}*/
		
		//segunda forma
		String[] arrayAsterisks= {"* * *", "* * *", "* * *"};
		
		for (String elem: arrayAsterisks){
			
			System.out.println(elem);
		}
		
	}
}
