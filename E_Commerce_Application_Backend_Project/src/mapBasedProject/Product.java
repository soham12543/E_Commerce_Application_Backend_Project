package mapBasedProject;

public class Product {
	String category;
	String brand;
	int price;
	
	Product()
	{
		
	}

	Product(String category, String brand, int price)
	{
		this.category=category;
		this.price= price;
		this.brand=brand;
	}
	
	@Override
	public String toString()
	{
		return "category:" + category + "|" + "price:" + price + "|" + "brand" + brand ;
		
	}
}
