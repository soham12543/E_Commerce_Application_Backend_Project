package ListBasedProject;

public class Shirt implements Comparable<Shirt>
{
    String brand;
    int price;
    String color;
    int size;
    
    Shirt()
    {
    	
    }
    Shirt(String brand, int price, String color, int size)
    {
    	this.brand=brand;
    	this.price=price;
    	this.color=color;
    	this.size=size;
    }
    
    public String toString()
    {
    	return (" Brand : "+ brand + " Colour : " + color + " Price : " + price + " Size :" + size);
    }
    
	@Override
	public int compareTo(Shirt o) {
		return this.price-o.price;
	}
    
  
}
