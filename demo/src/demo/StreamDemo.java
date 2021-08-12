package demo;
import java.util.List;
import java.util.stream.Collectors;


import java.util.ArrayList;
import java.util.maps

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(7);
		System.out.println(numbers);
		numbers.forEach(System.out::println);
		numbers.stream().map(e->e*2).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("sorted list");
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("filtered list");
		numbers.stream().filter(e->e>=3).forEach(System.out::println);
		System.out.println("mapped list");
		List<Integer> number= numbers.stream().map(e->e*e).collect(Collectors.toMap());
		number.forEach(System.out::println);
		System.out.println(number);
		
		
		
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
	}

}
