package mapBasedProject;

public class Laptop extends Product
{
    
     int ram;
     String processor;
	
	Laptop()
	{
		 
	}
	
	Laptop(int ram, String processor, String category, String brand, int price)
	
	{
		super(category, brand, price);
		this.ram=ram;
		this.processor=processor;
	}
	
	public String toString()
	{
		return super.toString()+" ram: "+ram+"|"+"processor"+ processor ;
	}
	
	
}
