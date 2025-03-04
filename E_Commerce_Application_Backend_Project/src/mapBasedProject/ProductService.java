package mapBasedProject;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductService {
	
	private Map<String,Product> products;
	
	ProductService(Map<String,Product> products)
	{
		this.products=products;
	}
	
	public void StoreProducts() // a
	{
		for(Product product : products.values())
		{
			System.out.println(product);
		}
	}
	
	
	
	public void AccessProducts()//b
	{
		for(Map.Entry<String,Product> product :products.entrySet())
		{
			System.out.println(product.getKey() + "-->" + product.getValue());
		}
	}
	
	public void CountMobileProducts()//f
	{
		int count=0;
		for(Map.Entry<String,Product> product :products.entrySet())
		{
			
			 if(product.getValue() instanceof Mobile) {
				 System.out.println(product.getKey() + "-->" + product.getValue());
			count++;
			
		}
		
	   }
		System.out.println("Mobile products are :" + count);
	
	}
	
	
	public void AccessAllShirtProducts()//e
	{
		
		for(Map.Entry<String,Product> product :products.entrySet())
		{
			
			 if(product.getValue() instanceof Shirt) {
				 System.out.println(product.getKey() + "-->" + product.getValue());
			
			
		}
		
	   }
	}		
		
		public void AccessAllMobileProducts()//d
		{
			
			for(Map.Entry<String,Product> product :products.entrySet())
			{
				
				 if(product.getValue() instanceof Mobile) {
					 System.out.println(product.getKey() + "-->" + product.getValue());
				
				
			}
			
		   }
		}		
			public void CountShirtProducts()//g
			{
				int count=0;
				for(Map.Entry<String,Product> product :products.entrySet())
				{
					
					 if(product.getValue() instanceof Shirt) {
						 System.out.println(product.getKey() + "-->" + product.getValue());
					count++;
					
				}
				
			   }
				System.out.println("Shirt products are :" + count);
			
			}
			
			public void CountShirtProductBySize(int givensize)//h
			{
				int count =0;
				for(Map.Entry<String,Product> product :products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s=(Shirt) product.getValue();
						if(s.size==givensize)
							count++;
					}
				}
				System.out.println("count of given size shirt is :" + count);
			}
			
			public void AccessShirtProductBySizeAndBrand(int givensize, String givenbrand)//i
			{
				
				for(Map.Entry<String,Product> product :products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s=(Shirt) product.getValue();
						if(s.size==givensize && s.brand.equalsIgnoreCase(givenbrand)) {
						System.out.println(product);
						}		
					}
				}
	
			}
			
			public void AccessShirtProductBySizeAndPrice(int givensize, int givenprice)//i
			{
				
				for(Map.Entry<String,Product> product :products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s=(Shirt) product.getValue();
						if(s.size==givensize && s.price>=givenprice) {
						System.out.println(product);
						}		
					}
				}
	
			}
			
//			public void  sort()
//			{

				
		/*	  List<Product> values=(List<Product>) products.values();
	
			  Comparator<Shirt>lowToHigh=(s1,s2)-> Integer.compare(s1.price,s2.price);  
			  Collections.sort(values, lowToHigh);*/
//			}
			
			public void AllBrandsAvailable()
			{
				Set<String> shirtbrands=new HashSet<>();
				Set<String> mobilebrands=new HashSet<>();
				Set<String> jeansbrands=new HashSet<>();
				Set<String> laptopbrands=new HashSet<>();
				
				System.out.println("Brands for Shirts: ");
				for(Map.Entry<String , Product> product : products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s = (Shirt)product.getValue();
						shirtbrands.add(s.brand);
					}
					
					else if(product.getValue() instanceof Mobile)
					{
						Mobile m=(Mobile)product.getValue();
						mobilebrands.add(m.brand);
					}
					
					else if(product.getValue() instanceof Jeans)
					{
						Jeans j=(Jeans)product.getValue();
						jeansbrands.add(j.brand);
					}
					
					else
					{
						Laptop l=(Laptop)product.getValue();
						laptopbrands.add(l.brand);
						
					}	
					
				}
				
				System.out.println(shirtbrands);
				System.out.println(mobilebrands);
				System.out.println(jeansbrands);
				System.out.println(laptopbrands);
			
				
			}
			
			public void AccessAllShirtBySize()//i
			{
				
				for(Map.Entry<String,Product> product :products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s=(Shirt) product.getValue();
						System.out.println(s.size);
				    }		
				}
			}
			
			
				
				public void CountShirtsByUserInput(String givenbrand)
				{
					int count =0;
					
					for(Map.Entry<String, Product> product : products.entrySet())
					{
						if(product.getValue() instanceof Shirt)
						{
							Shirt s = (Shirt)product.getValue();
							if(s.brand.equalsIgnoreCase(givenbrand))
							{
								System.out.println(s.brand);
								count++;
							}
						}
					}
					System.out.println("count is " + count);
				}
				
				
			public void countShirtsAvailableEachBrand()
				{
					Map<String , Integer> m2 = new HashMap<>();
					for(Map.Entry<String, Product> product : products.entrySet())
					{
						if(product.getValue() instanceof Shirt)
						{
							Shirt s = (Shirt)product.getValue();
							if(! m2.containsKey(s.brand))
							{
								m2.put(s.brand, 1);
							}
							else
							{
								m2.put(s.brand, m2.get(s.brand)+1);
							}
						}
					}
					
					
					Set<Map.Entry<String, Integer>> s1 = m2.entrySet();
					for(Map.Entry<String, Integer> p:s1)
					{
						System.out.println(p.getKey()+" value is : "+p.getValue());
					}
					
				}
			
			
			
			
			public void countShirtsAvailableEachSize()
			{
				Map<Integer , Integer> m2 = new HashMap<>();
				for(Map.Entry<String, Product> product : products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s = (Shirt)product.getValue();
						if(! m2.containsKey(s.size))
						{
							m2.put(s.size, 1);
						}
						else
						{
							m2.put(s.size, m2.get(s.size)+1);
						}
					}
				}
				
				
				Set<Map.Entry<Integer, Integer>> s1 = m2.entrySet();
				for(Map.Entry<Integer, Integer> p:s1)
				{
					System.out.println(p.getKey()+" value is : "+p.getValue());
				}
				
			}

			
			
			
			
			public void countShirtsAvailableEachColor()
			{
				Map<String , Integer> m2 = new HashMap<>();
				for(Map.Entry<String, Product> product : products.entrySet())
				{
					if(product.getValue() instanceof Shirt)
					{
						Shirt s = (Shirt)product.getValue();
						if(! m2.containsKey(s.color))
						{
							m2.put(s.color, 1);
						}
						else
						{
							m2.put(s.color, m2.get(s.color)+1);
						}
					}
				}
				
				
				Set<Map.Entry<String , Integer>> s1 = m2.entrySet();
				for(Map.Entry<String , Integer> p:s1)
				{
					System.out.println(p.getKey()+" value is : "+p.getValue());
				}
				
			}
			
			public void removeProductByProuctId(String givenid)
			{
				if(products.containsKey(givenid))
				{
					products.remove(givenid);
				}
//				Set<Map.Entry<String, Product>> product =products.entrySet();
//				Iterator<Map.Entry<String, Product>>itr=product.iterator();
//				while(itr.hasNext())
//				{
//					Map.Entry<String, Product> p=itr.next();
//					if(p.getKey().equalsIgnoreCase(givenid))
//					{
//					   itr.remove();
//					}
//				}
				
			System.out.println(products);
			}
			
			public void differentProductsAvailable()
			{
				Set<String> prod = new HashSet<>();
				for(Map.Entry<String, Product> product : products.entrySet())
				{
					prod.add(product.getValue().getClass().getSimpleName());
				}
				
				System.out.println(prod);
			}

		}
				
