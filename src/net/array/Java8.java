package net.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

	private int no =10;
	private static String name="Ram";
	
	public static void main(String[] args) {
		
		Predicate<Integer> checkEvent = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Consumer<String> consumer = Java8::showConsumer;
		consumer.accept("jack");
		consumer.accept("jill");
		consumer.accept("Ram");
		
		List<String> users = new ArrayList<String>();
		users.add("jack");
		users.add("jill");
		users.add("ram");
		//users.stream().forEach((name)->{showSupplier(()->name)});
		
		String s = users.stream().reduce("",String::concat);
		System.out.println(s);
		
		List<Integer> values = (List<Integer>) Arrays.asList(10,40,20,60,80,0,80,30,40)
				.stream().filter(value -> value > 18)
				.sorted()
				.sequential()
				.map(Integer::new)
				.distinct()
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(values.toString());
		
		Function<String, Integer> length = (s1) -> s1.length();
		Function<Integer, Boolean> condition = (i) -> i < 10;
		Function<String, Boolean> function = length.andThen(condition);
		System.out.println(function.apply("java 8"));
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> result = numbers.stream().skip(2).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(result.toString());
		
		Stream.of("a","b","c").filter(f -> {
			System.out.println(f);
			return true;
		});
				
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banana");
		
		Stream<String> fs = fruits.parallelStream();
		
		fs.filter(f -> {
			System.out.println(f);
			return false;
		}).forEach(fruit -> {});
		
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

	private static void showSupplier(Supplier<String> name2) {
		System.out.println("welcome"+name2.get());
	}
	public static void showConsumer(String name){
			System.out.println("Welcome::"+name);
		}
		public static void print(String name){
			name = name+ "Ne";
			Runnable r = () ->{
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				//System.out.println("we" + name);
			};
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




