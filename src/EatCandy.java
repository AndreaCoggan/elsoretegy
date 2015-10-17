public class EatCandy {
	public static void main(String[]args){
		Personn andrea = new Personn("Andrea");
		Candy candy = new Candy("Krackle" , "Hersheys", "Brown");
		andrea.unwrap(candy);
		
	}
}
class Personn{
	String name;
	Personn(String name){
		this.name = name;

	}
	void unwrap(Candy candy){
		System.out.println("You are unwrapping "+ candy.getFlavor());
	}
	
}
class Candy{
	String flavor;
	public String getFlavor() {
		return flavor;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	String brand;
	String color;
	Candy(String brand, String flavor, String color){
		this.brand = brand;
		this.color = color;
		this.flavor = flavor;
	}
	
}
