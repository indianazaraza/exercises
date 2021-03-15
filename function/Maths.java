public class Maths{
//31/1/21	
	public static void main(String args[]){
		
		checkIf_CanBePrime(25);
	}
	
	public static void checkIf_CanBePrime(int num){
		
		if (num > 1){
			
			System.out.println("The " + num + " is prime: " +_isPrime(num));
			
		}
	}
	
	public static boolean _isPrime(int num){
		
		return _isOneOfTheFirstPrimNum(num) || _equalsZero(numberOfDivisorsOf_(num));
	}
	
	public static boolean _isOneOfTheFirstPrimNum(int num){
		
		return num == 2 || num == 3 || num == 5 || num == 7;
	} 
	
	public static boolean _equalsZero(int numDivisors){
		
		return numDivisors == 0;
	}
	
	public static int _isDivisibleBy_(int num1, int num2){
		
		return (num1 % num2 == 0)? 1: 0;
	}
	
	public static int numberOfDivisorsOf_(int num){
		
		int dividersCounter= 0;
		
		for (int i= 3; i < 10; i++){
			
			dividersCounter += _isDivisibleBy_(num, i);
		}
		
		return dividersCounter;
	}
}
