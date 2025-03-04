package mapBasedProject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProductDriver {

	public static void main(String[] args) {
	Map<String , Product> m1 = new LinkedHashMap<>();
	m1.put("P001", new Shirt(42 , "Black", "Full" , "Formals",1545,"Nike"));
	m1.put("P002", new Shirt(43 , "Blue", "Half" , "Sports",1890,"Reebok"));
	m1.put("P003", new Shirt(44 , "Green", "V-neck" ,"PartyWear",2000,"Adidas"));
	m1.put("P004", new Shirt(42 , "Blue", "collar" , "Casuals",1600,"Nike"));
	

	
	m1.put("P005", new Mobile("S23",250,"Android","Samsung",54000));
	m1.put("P006", new Mobile("Iphone14",128,"IOS","Apple",45000));
	m1.put("P007", new Mobile("Note 5 Pro",128,"Android","Redmi",15000));
	m1.put("P008", new Mobile("Note 7",150,"Android","Real Me",54000));
	m1.put("P009", new Mobile("S22",250,"Android","Samsung",43000));
	m1.put("P0010", new Mobile("Iphone16Pro",250,"IOS","Apple",78000));
	m1.put("P0011", new Mobile("Note 7 Pro",250,"Android","Redmi",54000));



	m1.put("P0012", new Jeans(34,"Slim","Jeggings","ZARA",2500));
	m1.put("P0013", new Jeans(35,"Regular","Cropped","Pantaloons",2500));
	m1.put("P0014", new Jeans(45,"Loose","Distressed","H/M",2500));
	m1.put("P0015", new Jeans(30,"Regular","Flared","Nike",2500));
	m1.put("P0016", new Jeans(32,"Slim","Jeggings","H/M",2500));
	


	m1.put("P0017", new Laptop(16,"i7","Gaming","ASUS",62000));
	m1.put("P0018", new Laptop(8,"i5","Probook","Dell",52000));
	m1.put("P0019", new Laptop(16,"AMDRizen5","Gaming","HP",42000));
	m1.put("P0020", new Laptop(4,"i5","Probook","Dell",32000));
	m1.put("P0021", new Laptop(8,"i3","Gaming","ASUS",72000));
	m1.put("P0022", new Laptop(16,"Pentium","Probbok","Samsung",22000));
	

	
	ProductService service = new ProductService(m1);
	service.StoreProducts();//a
	
	System.out.println("===============");
	
	service.AccessProducts();//b
	
	System.out.println("===============");
	
	service.CountMobileProducts();//f
	
System.out.println("===============");
	
	service.AccessAllShirtProducts(); //e
	
System.out.println("===============");
	
	service.AccessAllMobileProducts(); //d
	
	System.out.println("===============");
	
	service.CountShirtProducts();
	
	System.out.println("===============");
	
	service.CountShirtProductBySize(42);//h
	
	System.out.println("===============");
	
	service.AccessShirtProductBySizeAndBrand(42, "Nike");//i
	
System.out.println("===============");
	
	service.AccessShirtProductBySizeAndPrice(42, 2000);//j 
	
	
System.out.println("===============");
	
	service.AllBrandsAvailable();//0
	
System.out.println("===============");
	
	service.AccessAllShirtBySize();//p
	
System.out.println("===============");
	
	service.CountShirtsByUserInput("nike");//q
	
	System.out.println("====================");
	
	service.countShirtsAvailableEachBrand();//r
	
System.out.println("====================");
	
	service.countShirtsAvailableEachSize();//s
	
	
System.out.println("====================");
	
	service.countShirtsAvailableEachColor();
	
	System.out.println("====================");
	
	service.removeProductByProuctId("P001");
	
	System.out.println("====================");
	
	service.differentProductsAvailable();
	
	}

}
