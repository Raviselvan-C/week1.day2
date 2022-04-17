package week1.day2;

public class Calculator {
	
	//should return sum of num1+num2+num3
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//sub(int num1, int num2), it should return subtraction of of num1-num2
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	
	//mul(double num1, double num2), it should return product of num1 * num2
	public double mul(double num1, double num2) {
		return num1*num2;
		
	}
	
	// divide(float num1, float num2), it should return division of num1 / num2
	public float divide(float num1, float num2) {
		return num1/num2;
		
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int addition = obj.add(1, 2, 3);
		int Subtraction = obj.sub(9, 4);
		double Multiplication = obj.mul(2.5, 2.3);
		float Division = obj.divide(20, 5);
		System.out.println("Add (1+2+3) - "+addition);
		System.out.println("Subtraction of (9-4) - "+Subtraction);
		System.out.println("Multiplication of (2.5 * 2.3) - "+Multiplication);
		System.out.println("Division of (20/5) - "+Division);
		
	}
}
