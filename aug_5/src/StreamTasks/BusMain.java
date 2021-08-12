package StreamTasks;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;


public class BusMain {

	public static void main(String[] args) {

		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Xyz Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		System.out.println(busList);
		System.out.println("using Sort()");
		List name=busList.stream().filter(e->e.getProviderName().equals("Abc Travels"))
				.map(e->e.getCost()).sorted().collect(Collectors.toList());
		System.out.println(name.get(0));
		System.out.println("Using reduce");
		Double minimumvalue =busList.stream().filter(e->e.getProviderName().equals("Xyz Travels"))
				.map(e->e.getCost()).reduce(Double.MAX_VALUE,(a,b)->Math.min(a, b));
		
		System.out.println(minimumvalue);
	}
	}
