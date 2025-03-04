package ListBasedProject;

import java.util.Comparator;

public class ManufactureComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		
		return Integer.compare(o1.mfy,o2.mfy);
	}

	
}
