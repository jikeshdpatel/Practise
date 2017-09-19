import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(Collections.reverseOrder());
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("d", "d");
		linkedHashMap.put("e", "e");
		linkedHashMap.put("g", "g");
		System.out.println(linkedHashMap);
		treeMap.put("d", "d");
		treeMap.put("e", "e");
		treeMap.put("g", "g");
		System.out.println(treeMap);
		//PriorityBlockingQueue<E>
		SortedSet<String> sortedSet = new TreeSet<>();
		//Lamda expression
		List<Country> contries = new ArrayList<>();
		Stream<Country> testCountries = contries.stream()
				.filter(country -> { return country.continent.equals("Test");});
		Stream<Long> testCountryPopulations = testCountries.map(c -> c.getPopulation());
		testCountryPopulations.reduce((long) 0, (a,b) -> a+b);
		
		System.out.println(contries.stream()
				.map(c -> "Test".equals(c.getContinent()) ? c.getPopulation() : 0)
				.reduce((long)0, (a,b) -> a + b));
		
		
		//Lamda random
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		Vector<Integer> randSubList = (Vector<Integer>) list.parallelStream()
			.filter(i -> {return rand.nextBoolean();})
			.collect(Collectors.toList());
		System.out.println(randSubList);
		
		Predicate<Object> flipCoin = o -> {
			return rand.nextBoolean();
		};
		
		list.stream()
			.filter(flipCoin)
			.collect(Collectors.toList());
		
		IdentityHashMap<String, String> idMap;
	}

	public static class Country{
		private String continent;
		private long population;
		public String getContinent() {
			return continent;
		}
		public void setContinent(String continent) {
			this.continent = continent;
		}
		public long getPopulation() {
			return population;
		}
		public void setPopulation(long population) {
			this.population = population;
		}
	}
}
