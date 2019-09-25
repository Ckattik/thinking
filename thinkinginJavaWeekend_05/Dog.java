package thinkinginJavaWeekend_05;

public class Dog {

	String str;
	
	
	public void bark() {
		System.out.println("Pussy Dog");
	}

	public void bark(String str) {
		
		

		System.out.println("Big Dog");

	}

	public void bark(int s) {

		System.out.println("Small Dog");

	}

	public void bark(float s) {

		System.out.println("Bigggest Dog");

	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dogString = new Dog();
		Dog dogInt = new Dog();
		Dog dogFloat = new Dog();
	}

}
