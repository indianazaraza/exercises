public class CharString1{
	
	public static void main(String args[]){
		
		System.out.println(theLastCharOf_("Hola"));
	}
	
	public static char theLastCharOf_(String word){
		
		StringBuilder modifWord= new StringBuilder();
		
		return modifWord.append(word).reverse().charAt(0);
	}
}
