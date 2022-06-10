package inheritance;

public class subClass extends Object {
	
	//variables 
	protected String dish;
	protected double price;
	protected double tax;
	
	//tax calculation variables
	private double divTax;
	private double totalTax;
	private double totalPrice;
	
	//constructor
	subClass(String dish, double price, double tax){
		this.dish = dish;
		this.price = price;
		this.tax = tax;
	}
	
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}	

	private double finalPrice() {
		
		divTax = tax/100;
		totalTax = price * divTax;
		totalPrice = totalTax + price;
		return totalPrice;
		
		 
	}
	//printing information to the user
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %.2f%n%s: %.2f%n%s:$%.2f",
				"Dish", dish,
				"Price", price,
				"Tax amount assigned", tax,
				"Total Cost", finalPrice());		
	}

	


	
}
