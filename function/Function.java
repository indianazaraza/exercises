public class Function{

//dibuja 25 líneas en blanco
	
	public static void main(String args[]){
		
		deleteScreen();
	}
	
	public static void deleteScreen(){
		
		int index= 0;
		
		while (index < 25){
			
			System.out.println();
			
			index++;
		}
	}
}
