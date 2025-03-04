package ListBasedProject;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarService {

	
	public void AccessAllCarsByBrand(List<Car> cars, String givenbrand)//b
	{
		for(Car c : cars)
		{
			if(c.brand.equalsIgnoreCase(givenbrand))
			{
				System.out.println(c);
			}
		}
	}
	
	public void AccessCarsByBrandAndPrice(List<Car> cars, String givenbrand, int givenprice)//c
	{
		for(Car c : cars)
		{
			if(c.brand.equalsIgnoreCase(givenbrand)&&c.price<=givenprice)
				System.out.println(c);
		}
	}
	
	public void AccessCarsByPrice(List<Car> cars, int givenprice)//d
	{
		for(Car c : cars)
		{
			if(c.price<=givenprice)
				System.out.println(c);
		}
	}
	
	
	public void AccessCarsByBrandAndMfyAndColor(List<Car> cars, String givenbrand, String givencolor, int givenmfy)//e
	{
		for(Car c : cars)
		{
			if(c.brand.equalsIgnoreCase(givenbrand)&&  c.mfy==givenmfy && c.color.equalsIgnoreCase(givencolor))
				System.out.println(c);
		}
	}
	
	public void AccessCarByPriceLowToHigh(List<Car> cars)
	{
		Collections.sort(cars, new PriceComparator());
		System.out.println(cars);
	}
	
	public void AccessCarByPriceHighToLow(List<Car> cars)
	{
		Collections.sort(cars , new PriceComparator().reversed());
		System.out.println(cars);
	}
	
	public void AccessCarByManufacturingYearHighToLow(List<Car> cars)
	{
		Collections.sort(cars, new ManufactureComparator());
		System.out.println(cars);
	}
	
	public void AccessAllCarsBrand(List<Car>cars)//i
	{
		Set<String> s = new HashSet<>();
		for(Car c : cars)
		{
			s.add(c.brand);
		}
		System.out.println(s);
	}
	
	
	public void CountCarByBrands(List<Car> cars)//j
	{
		Map<String, Integer> m1 = new HashMap<>();
		for(Car c : cars)
		{
			if( ! m1.containsKey(c.brand))
			{
				m1.put(c.brand, 1);
			}
			else {
				m1.put(c.brand, m1.get(c.brand)+1);
		}
		}
		Set<Map.Entry<String, Integer>> entryset = m1.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+ "freq is " + entry.getValue());
		}
	}
	
	
	public void CountCarByManufacturingYear(List<Car> cars)//l
	{
		Map<Integer, Integer> m1 = new HashMap<>();
		for(Car c : cars)
		{
			if( ! m1.containsKey(c.mfy))
			{
				m1.put(c.mfy, 1);
			}
			else {
				m1.put(c.mfy, m1.get(c.mfy)+1);
		}
		}
		Set<Map.Entry<Integer, Integer>> entryset = m1.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.println(entry.getKey()+ "freq is " + entry.getValue());
		}
	}
	
	
	public void CountCarByColor(List<Car> cars)//m
	{
		Map<String, Integer> m1 = new HashMap<>();
		for(Car c : cars)
		{
			if( ! m1.containsKey(c.color))
			{
				m1.put(c.color, 1);
			}
			else {
				m1.put(c.color, m1.get(c.color)+1);
		}
		}
		Set<Map.Entry<String, Integer>> entryset = m1.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+ "freq is " + entry.getValue());
		}
	}
}
