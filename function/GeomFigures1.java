public class GeomFigures1{

//dibuja un cuadrado de asteriscos de un tamaño recibido 
//recibe como parámetro un número de tipo int
	
	public static void main(String args[]){
		
		drawSquareOf_X_(3);
	}
	
	public static void drawSquareOf_X_(int size){
		
		int counterOfRow= 0;
		
		while (counterOfRow < size){
			
			drawRowOfAsterisksOf_(size);
			
			counterOfRow++;
		}
	}
	
	public static void drawRowOfAsterisksOf_(int size){
		
		//dibuja una fila de asteriscos de un tamaño recibido
		//recibe como parámetro un número de tipo int
		
		int sizeOfRow= 0;
		
		while (sizeOfRow < size){
			
			System.out.print("* ");
			
			sizeOfRow++;
		}
		
		System.out.println();
	}
}
