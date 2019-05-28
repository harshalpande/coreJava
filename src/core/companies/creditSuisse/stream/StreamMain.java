package core.companies.creditSuisse.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	static List<Person> listPerson = new ArrayList<>();

	static {
		listPerson.add(new Person("abcd", 23, 1232.34));
		listPerson.add(new Person("defh", 35, 1321.65));
		listPerson.add(new Person("ijkl", 63, 8864.01));
		listPerson.add(new Person("lmno", 53, 2299.42));
		listPerson.add(new Person("opqr", 53, 7967.64));
		listPerson.add(new Person("rstu", 52, 9088.28));
		listPerson.add(new Person("uvwx", 26, 3453.54));
		listPerson.add(new Person("xyza", 46, 6363.74));
		listPerson.add(new Person("bcde", 75, 3245.54));
		listPerson.add(new Person("fghi", 36, 5363.34));
		listPerson.add(new Person("jklm", 45, 2234.37));
		listPerson.add(new Person("mnop", 35, 3564.74));
		listPerson.add(new Person("qrst", 63, 8435.23));
		listPerson.add(new Person("uvwx", 65, 3232.56));
		listPerson.add(new Person("yzab", 17, 3000.74));
		listPerson.add(new Person("cdef", 75, 1000.33));
		listPerson.add(new Person("ghij", 63, 3322.54));
		listPerson.add(new Person("klmn", 25, 5364.11));
		listPerson.add(new Person("opqr", 37, 2238.56));
		listPerson.add(new Person("stuv", 44, 2234.02));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * functional interface contract : Consumer Returns : void forEach is an
		 * iterable as well as a stream operation
		 */
		listPerson.forEach(person -> System.out.println(person));

		System.out.println("------------PRINT ALL ABOVE----------------");

		/**
		 * functional interface contract : Predicate Returns : Another Stream of Same
		 * Object Type for e.g here returns Stream<Person> filter is an initial or
		 * Intermediate stream operation
		 */
		listPerson.stream().filter(person -> person.getAge() < 35).forEach(person -> System.out.println(person));

		System.out.println("-----------PRINT BELOW AGE 35----------------");

		Map<String, Integer> map = listPerson.stream().filter(person -> person.getAge() < 35)
				.collect(Collectors.toMap(Person::getName, Person::getAge));

		System.out.println(map);

		System.out.println("-----------Collect To MAP :: print----------------");

		Map<Integer, String> mapBinaryFunc = listPerson.stream().filter(person -> person.getAge() >= 53)
				.collect(Collectors.toMap(Person::getAge, Person::getName, (oldValue, newValue) -> {
					return String.join(":", oldValue, newValue);
				}));

		System.out.println(mapBinaryFunc);

		System.out.println("-----------Collect To MAP :: Binary Func (Duplicates)----------------");

		Map<Integer, String> treeMap = listPerson.stream().filter(person -> person.getAge() < 50)
				.collect(Collectors.toMap(Person::getAge, Person::getName,
						(oldValue, newValue) -> oldValue + ":" + newValue, TreeMap::new));

		System.out.println(treeMap);

		System.out.println("-----------Collect To TREE-MAP :: Supplier Function----------------");

		List<Person> listPerson2 = new ArrayList<>();

		listPerson2.add(new Person("Harshal", 32, 4423.43));
		listPerson2.add(new Person("Shankarlal", 63, 2523.22));
		listPerson2.add(new Person("Shaila", 56, 5224.33));
		listPerson2.add(new Person("Jatin", 28, 5242.21));
		listPerson2.add(new Person("Snehal", 30, 5533.22));

		System.out.println("-----------Merge 2 Lists--------------");
		System.out.println("-------List 1 Below------------------");

		System.out.println(listPerson2);

		System.out.println("-------Merged List Below------------------");

		Stream<Person> p1 = listPerson.stream();
		Stream<Person> p2 = listPerson2.stream();

		Stream.concat(p1, p2).collect(Collectors.toList()).forEach(System.out::print);

		System.out.println("-------Reduce Operation - Find Max Salary above 40------------------");
		listPerson.stream().filter(p -> p.getAge() > 40).mapToDouble(Person::getSalary)
				.reduce((val1, val2) -> val1 > val2 ? val1 : val2).ifPresent(System.out::println);

		System.out.println("-------Reduce Operation - With Identity------------------");
		Double doubleVal = listPerson.stream().filter(p -> p.getAge() > 70).reduce(0.0,
				(doubleSalary, person) -> doubleSalary + person.getSalary(), Double::sum);
		System.out.println(doubleVal);
		
	}
}
