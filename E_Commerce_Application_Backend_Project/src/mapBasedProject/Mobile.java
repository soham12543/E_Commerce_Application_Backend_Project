package mapBasedProject;

public class Mobile extends Product {
	
	String model;
	int storage;
	
	Mobile()
	{
		
	}

	Mobile(String model, int storage, String category, String brand, int price)
	{
		super(category, brand, price);
		this.model= model;
		this.storage=storage;
	}
	
	public String toString()
	{
		return super.toString()+ "model:" + model + "|" + "storage:" + storage
 ;	}
}
