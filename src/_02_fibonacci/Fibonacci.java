package _02_fibonacci;
public class Fibonacci {
public static void main(String[] args) {
	int number1 = 0;
	int number2 = 1;
	int sum = number1 + number2;
	for (int i = 0; i < 10; i++) {
		System.out.println(sum);
		number1 = number2;
		number2 = sum;
		sum = number1 + number2;
				
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
