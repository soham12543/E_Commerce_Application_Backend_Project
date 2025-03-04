package ListBasedProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		List<Car> c1 = new ArrayList<>();
		c1.add(new Car("TATA" , 200000, "Red" ,2000));
		c1.add(new Car("MARUTI" , 300000, "Blue" ,2001));
		c1.add(new Car("BMW" , 400000, "Red" ,1995));
		c1.add(new Car("TATA" , 300000, "Red" ,2002));
		c1.add(new Car("TATA" , 200000, "Yellow" ,2003));
		c1.add(new Car("MARUTI" , 400000, "Yellow" ,1996));
		c1.add(new Car("BMW" , 400000, "Orange" ,1993));
		c1.add(new Car("MARUTI" , 300000, "Black" ,2002));
		CarService service = new CarService();
		//Scanner sc = new Scanner(System.in);
		System.out.println("=========================");
		
//		System.out.println("Access All cars By brands");//b
//		System.out.println("Enter the name of the  brand");
//		String brand = sc.nextLine();
//		service.AccessAllCarsByBrand(c1, brand);
		
		
//		System.out.println("Access All cars By brands and price");//c
//		System.out.println("Enter the brand of the car");
//		try {
//		String brand1 = sc.nextLine();
//		System.out.println("Enter the price of the car ");
//		int price = sc.nextInt();
//		service.AccessCarsByBrandAndPrice(c1, brand1, price);
//		}
//		catch(Exception e )
//		{
//			System.out.println("Try again!!");		
//		}
//		
//		System.out.println("Access All cars By givenprice");//d
//		System.out.println("Enter the price of the car");
//		int price = sc.nextInt();
//		service.AccessCarsByPrice(c1, price);
		
		
		
		
//		System.out.println("Access All cars By givenbrand , color , mfy");//d
//		System.out.println("Enter the brand of the car");
//		//String brand1 = sc.nextLine();
//		System.out.println("enter the color");
//		String color = sc.nextLine();
//		System.out.println("enter the mfy");
//		int mfy = sc.nextInt();
//		service.AccessCarsByBrandAndMfyAndColor(c1, brand1,color, mfy );
		System.out.println("======================");
		System.out.println("cars high to low are :");	//f	
		service.AccessCarByPriceHighToLow(c1);
		
		System.out.println("=========================");
		System.out.println("cars low to high are :");//g
		service.AccessCarByPriceLowToHigh(c1);
		
		System.out.println("=========================");
		System.out.println("cars according to latest to old manufacturing year: ");//h
		service.AccessCarByManufacturingYearHighToLow(c1);
		
		
		System.out.println("=========================");//i
		System.out.println("All brands are :");
		service.AccessAllCarsBrand(c1);
		
		
		System.out.println("=========================");//j
		System.out.println("All brands of car with freq are :");
		service.CountCarByBrands(c1);
		
		// k is same 
		
		System.out.println("=========================");//l
		System.out.println("All car with mfy and  with freq are :");
		service.CountCarByManufacturingYear(c1);
		
		
		System.out.println("=========================");//m
		System.out.println("All car with color freq are :");
		service.CountCarByColor(c1);
		
	}
	
	
	

}
