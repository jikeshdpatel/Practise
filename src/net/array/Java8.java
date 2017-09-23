package net.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(36,1000));
		persons.add(new Person(16,2000));
		persons.add(new Person(26,3000));
		persons.add(new Person(36,4000));
		persons.add(new Person(46,5000));
		
		List<Double> salaries = persons.stream().filter(person -> {
			if(person.age > 18)
				return true;
			else
				return false;
		}).map(Person::getSalary)
		.collect(Collectors.toList());
		
		System.out.println(salaries);
		
	}

}

class Person {
	public int age;
	public double salary;
	public Person(int age, double salary){
		this.age = age;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}


