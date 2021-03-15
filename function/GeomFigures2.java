public class GeomFigures2{

//dibuja un rectángulo de asteriscos del ancho y alto recibidos
//el ancho y el alto son números de tipo int 
	
	public static void main(String args[]){
		
		drawRectangleOfAsterisksOf_X_(4, 5); 
	}
	
	public static void drawRectangleOfAsterisksOf_X_(int width, int height){
		
		int heightMeasure= 0;
		
		while (heightMeasure < height){
			
			draw_ExtensionRectangle(width);
			
			heightMeasure++;
		}
	}
	
	public static void draw_ExtensionRectangle(int width){
		
		//dibuja la extensión del rectangulo del ancho recibido
		//recibe como parámetro un ancho de tipo int 
		
		int widthMeasurement= 0;
		
		while (widthMeasurement < width){
			
			System.out.print("* ");
			
			widthMeasurement++;
		}
		
		System.out.println();
	}
}
