package inheritance;

public class main {
	public static void main(String[] args) {
		
		//creating objects
		subClass obj1 = new subClass("Chicken", 19.99,3.5 );
		superClass obj2 = new superClass("Chicken", 19.99,3.5);
		
		System.out.println("Welcome to the main class!");
		System.out.println();
		System.out.println("Printing SubClass toString method ");
		System.out.println();
		System.out.println(obj1.toString()); //printing first object information
		System.out.println();
		
		
		System.out.println("Printing SuperClass toString method using super toString" );
		System.out.println();
		System.out.println(obj2.toString()); //printing second object information
	}

}
