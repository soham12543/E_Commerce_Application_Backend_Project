package mapBasedProject;

public class Shirt extends Product{
	
	int size;
	String color;
	String type;
	
	Shirt()
	{
		
	}

	Shirt(int size , String color, String type, String category , int price , String brand)
	{
		super(category, brand,price);
		this.size= size;
		this.color= color;
		this.type= type;
	}
	
	public String toString()
	{
		return super.toString()+ "size:" + size +"|" + "color:" + color +"|" +"type:" +type;
		
	}
}
