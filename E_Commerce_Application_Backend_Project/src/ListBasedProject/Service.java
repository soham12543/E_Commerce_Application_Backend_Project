package ListBasedProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Service {
	
	
	public void AccessAllShirts(List<Shirt> l1)
	{
		for(Shirt x: l1)
		{
		   System.out.println(x.toString());
			
		}
		
	}
	
	public Set<String> AccessAllBrands(List<Shirt> l1)//h
	{
		Set<String> brands=new HashSet<>();
		for(Shirt x: l1)
		{
		   brands.add(x.brand);
			
		}
		return brands;
		
	}
	
	public Set<Integer> AccessAllSize(List<Shirt> l1)//i
	{
		Set<Integer> sizes=new HashSet<>();
		for(Shirt x: l1)
		{
		   sizes.add(x.size);
		}
		return sizes;
	}
	
	public Set<String> AccessAllColors(List<Shirt> l1)
	{
		Set<String> colors=new HashSet<>();
		for(Shirt x: l1)
		{
		   colors.add(x.color);
		}
		return colors;
	}
	
	public Set<Integer> AccessAllPrice(List<Shirt> l1)
	{
		Set<Integer> Prices=new HashSet<>();
		for(Shirt x: l1)
		{
		   Prices.add(x.price);
		}
		return Prices;
	}
	
	
	public void AccessAllShirtsByBrand(List<Shirt> shirts, String givenbrand) //b
	{
		for(Shirt s : shirts)
		{
			if(s.brand.equalsIgnoreCase(givenbrand))
			{
				System.out.println(s);
			}
		}
	}
	
	public void AccessAllShirtsByBrandAndSize(List<Shirt> shirts, String givenbrand, int givensize) //c
	{
		for(Shirt s : shirts)
		{
			if(s.brand.equalsIgnoreCase(givenbrand) && s.size==givensize)
			{
				System.out.println(s);
			}
		}
	}
	
	public void AccessAllShirtsByPrice(List<Shirt> shirts,  int givenprice) //d
	{
		for(Shirt s : shirts)
		{
			if( s.price<=givenprice)
			{
				System.out.println(s);
			}
		}
	}
	
	public void AccessAllShirtsBySizeAndPrice(List<Shirt> shirts,  int givenprice, int givensize) //e
	{
		for(Shirt s : shirts)
		{
			if(s.size==givensize&& s.price>givenprice)
			{
				System.out.println(s);
			}
		}
	}
	
	public void SortPriceLowToHigh(List<Shirt> shirts)//f
	{
		Collections.sort(shirts);
		System.out.println(shirts);
	}
	
	public void SortPriceHighToLow(List<Shirt> shirts)//g
	{
		Collections.sort(shirts, Collections.reverseOrder());
		System.out.println(shirts);
	}
	
	
	public void CountAllShirtsByParticularBrand(List<Shirt> shirts, String givenbrand) //j
	{
		int count=0;
		for(Shirt s : shirts)
		{
			if(s.brand.equalsIgnoreCase(givenbrand))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void CountShirtsByBrand(List<Shirt> shirts) //k
	{
		Map<String , Integer> m1 = new HashMap<>();
		for(Shirt s : shirts)
		{
			if(! m1.containsKey(s.brand))
			{
				m1.put(s.brand,1);
			}
			else
				m1.put(s.brand, m1.get(s.brand)+1);
		}
		
	Set<Map.Entry<String , Integer>> entryset = m1.entrySet();
	Iterator<Map.Entry<String , Integer>> itr = entryset.iterator();
	    while (itr.hasNext())
	    {
	    	Map.Entry<String , Integer > entry = itr.next();
	    	System.out.println(entry.getKey()+ " freq is " + entry.getValue());
	    }
	}
	
	public void CountShirtsBySize(List<Shirt> shirts) //l
	{
		Map<Integer, Integer> m1 = new HashMap<>();
		for(Shirt s : shirts)
		{
			if(! m1.containsKey(s.size))
			{
				m1.put(s.size,1);
			}
			else
				m1.put(s.size, m1.get(s.size)+1);
		}
		
	Set< Integer> keyset = m1.keySet();
	Iterator<Integer> itr = keyset.iterator();
	    while (itr.hasNext())
	    {
	     Integer keys = itr.next();
	    	System.out.println(keys+ " freq is " + m1.get(keys));
	    }
	}
	
	
	public void CountShirtsByColor(List<Shirt> shirts) //m
	{
		Map<String, Integer> m1 = new HashMap<>();
		for(Shirt s : shirts)
		{
			if(! m1.containsKey(s.color))
			{
				m1.put(s.color,1);
			}
			else
				m1.put(s.color, m1.get(s.color)+1);
		}
		
	Set<String> keyset = m1.keySet();
	Iterator<String> itr = keyset.iterator();
	    while (itr.hasNext())
	    {
	     String keys = itr.next();
	    	System.out.println(keys+ " freq is " + m1.get(keys));
	    }
	}
	
	
	

}
