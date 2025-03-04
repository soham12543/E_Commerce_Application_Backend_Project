package ListBasedProject;

import java.util.ArrayList;
import java.util.List;

public class ShirtDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shirt> l1=new ArrayList<>();
		l1.add(new Shirt("Reebok",2777,"Red",45));
		l1.add(new Shirt("Addidas",2779,"Yellow",42));
		l1.add(new Shirt("Nike",2778,"Blue",47));
		l1.add(new Shirt("Arrow",2776,"Orange",40));
		l1.add(new Shirt("Nike",2478,"Blue",47));
		l1.add(new Shirt("Arrow",2376,"Orange",42));
		l1.add(new Shirt("Nike",2745,"Blue",42));
		l1.add(new Shirt("Arrow",2756,"Orange",43));
		
		Service service=new Service();
		service.AccessAllShirts(l1);
		System.out.println(service.AccessAllBrands(l1));
		System.out.println(service.AccessAllSize(l1));
		System.out.println(service.AccessAllPrice(l1));
		System.out.println(service.AccessAllColors(l1));
	
		System.out.println("============================");
		
	
		service.AccessAllShirtsByBrand(l1, "arrow");//b
		
		System.out.println("============================");
		
		System.out.println("High to low ");//f
		service.SortPriceHighToLow(l1);
		
        System.out.println("============================");
		
		System.out.println("Low to High ");//g
		service.SortPriceLowToHigh(l1);
		service.CountAllShirtsByParticularBrand(l1, "Nike");
		
		System.out.println("============================");
		
		System.out.println(" freq of shirts by brand");
		service.CountShirtsByBrand(l1);
		
       System.out.println("============================");
		
		System.out.println(" freq of shirts by size");//l
		service.CountShirtsBySize(l1);
		
		 System.out.println("============================");
			
			System.out.println(" freq of shirts by color");//l
			service.CountShirtsByColor(l1);

	}

}
