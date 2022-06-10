package inheritance;

public class superClass extends subClass{

	//new tax rate 
	protected final double taxRate = 5.55;
	
	//constructor
	superClass(String dish, double price, double tax) {
		super(dish, price, tax);//superClass constructor
		this.tax = taxRate; //updating tax rate
	}

	//printing UPDATED information to the user
	@Override
	public String toString() {
		return String.format(super.toString());
	}
}
