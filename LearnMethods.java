package week1.day2;

public class LearnMethods {
	
	public void printCarName() {
		System.out.println("Car Name is Tata Sumo");
	}
	public int getCarRegNumber() {
		return 1234;
		
	}
	public String getvarient() {
		return "Victa";
	}
	
	public int multiplyingTwoNumbers(int a, int b) {
		return a*b;
		
	}
	
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printCarName();
		int CarRegNumber = obj.getCarRegNumber();
		System.out.println("Register Number - "+CarRegNumber);
		String CarVariant = obj.getvarient();
		System.out.println("Car Varient - "+CarVariant);
		int productOfTwoNumbers = obj.multiplyingTwoNumbers(4, 5);
		System.out.println("Multiplication of a & b - "+productOfTwoNumbers);
	}
}
