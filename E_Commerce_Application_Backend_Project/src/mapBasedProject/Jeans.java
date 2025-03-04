package mapBasedProject;

public class Jeans extends Product{
	
	int waistsize;
	String fitType;
	
	Jeans()
	{
		
	}

	Jeans(int waistsize , String fitType, String category, String brand, int price)
	{
		super(category, brand, price);
		this.waistsize=waistsize;
		this.fitType=fitType;
	}
	
	public  String toString()
	{
		return super.toString()+ "waistsize:"+ waistsize + "|"  + "fitType:" + fitType;
	}
}
