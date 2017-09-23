package net.array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngine;



public class Practice {

	private int no =10;
	private static String name="Ram";
	
	public static void main(String[] args) {
		/*SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			System.out.println(format.parse("02-03-2015"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			int a = 10/0;
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException
				e){
			System.out.println(e);
		}*/
		// TODO Auto-generated method stub
		//System.out.println(no);
		//Optional<T>
	 /*Object obj = new Object();
	 
System.out.println(ZonedDateTime.now());
System.out.println(LocalDateTime.now());
System.out.println(OffsetDateTime.now());
System.out.println(Calendar.getInstance().getTime());

int a = Integer.MAX_VALUE;
int b = Integer.MAX_VALUE;
int c = Math.addExact(a, b);*/
//int d = Math.sum(a,b);


		System.out.println(LocalDateTime.now().toLocalTime());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		System.out.println(cal.getTime());
		
		Predicate<Integer> checkEvent = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Consumer<String> consumer = Practice::showConsumer;
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
	
	/*default static void testdefaul(){
		
	}*/

}
