package ListBasedProject;

public class Car {
	
	String brand ;
	int price ;
	String color ;
	int mfy ;
	
	
	Car()
	{
		
	}
	
	Car(String brand , int price , String color , int mfy)
	{
		this.brand= brand;
		this.price= price;
		this.color= color;
		this.mfy= mfy;
	}
	
	@Override
	public String toString()
	{
		return "  brand :  " + brand + " price : " + price + " color  " + color + " mfy :  " + mfy ;
		
	}

	
	

}
