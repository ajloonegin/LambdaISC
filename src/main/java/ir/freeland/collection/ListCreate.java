package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Person;

public class ListCreate {
	public static void main(String[] args) {
		
		Address address1=new Address(17,"arak","iran");
		Address address2=new Address(18,"ghom","iran");
		Address address3=new Address(2,"karaj","iran");
		Address address4=new Address(8,"tehran","iran");

		Person alireza = new Person("Alireza", "fattahi", 48, address1); 
		Person roham = new Person("Roham", "kabir", 10, address2);
		Person arefeh = new Person("Arefeh", "ajloo", 15, address3);
		Person radmeher = new Person("Radmehr", "rezaee", 12, address4);
		
		
		//Solution 1
		List<Person> persons = new ArrayList<>();		
		persons.add(alireza);
		persons.add(roham);
		persons.add(arefeh);
		
		//Solution 2
		Person[] presonsArray = {alireza,roham,arefeh,radmeher};
		List personss= Arrays.asList(presonsArray);


		
		//Sort by city
		
		
		List<Address> addressList = new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);
		addressList.add(address3);
		addressList.add(address2);

		System.out.println( addressList );
		
		
		
		addressList.sort((a1, a2) -> a1.getCity() - a2.getCity());
		System.out.println(addressList);

		Comparator<Person> compareCity = (p1, p2) -> p1.getCity() - p2.getCity();
		addressList.sort(compareCity);

		System.out.println(addressList);
		
		//partition greater than 18
		Map<Boolean, List<Person>> adultsAge = 
				persons.stream().collect( Collectors.partitioningBy(p -> p.getAge()>18));
		
		System.out.println(adultsAge);
		
		//group by city
		Map<Integer, List<Person>> groupCity = 
				persons.stream().collect(  Collectors.groupingBy(p.Address -> p.getCity()));
		System.out.println(groupCity);
		
		//avg of ages
		double averageAge = persons
				.stream()
				.mapToDouble(p -> p.getAge())
				.average()
				.getAsDouble();
	
		System.out.println(averageAge);
	}
}
