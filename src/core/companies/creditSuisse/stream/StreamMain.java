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
		listPerson.add(new Person("abcd", 23));
		listPerson.add(new Person("defh", 35));
		listPerson.add(new Person("ijkl", 63));
		listPerson.add(new Person("lmno", 53));
		listPerson.add(new Person("opqr", 53));
		listPerson.add(new Person("rstu", 52));
		listPerson.add(new Person("uvwx", 26));
		listPerson.add(new Person("xyza", 46));
		listPerson.add(new Person("bcde", 75));
		listPerson.add(new Person("fghi", 36));
		listPerson.add(new Person("jklm", 45));
		listPerson.add(new Person("mnop", 35));
		listPerson.add(new Person("qrst", 63));
		listPerson.add(new Person("uvwx", 65));
		listPerson.add(new Person("yzab", 17));
		listPerson.add(new Person("cdef", 75));
		listPerson.add(new Person("ghij", 63));
		listPerson.add(new Person("klmn", 25));
		listPerson.add(new Person("opqr", 37));
		listPerson.add(new Person("stuv", 44));
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
		
		listPerson2.add(new Person("Harshal", 32));
		listPerson2.add(new Person("Shankarlal", 63));
		listPerson2.add(new Person("Shaila", 56));
		listPerson2.add(new Person("Jatin", 28));
		listPerson2.add(new Person("Snehal", 30));
		
		System.out.println("-----------Merge 2 Lists--------------");
		System.out.println("-------List 1 Below------------------");
		
		System.out.println(listPerson2);
		
		System.out.println("-------Merged List Below------------------");
		
		Stream<Person> p1 = listPerson.stream();
		Stream<Person> p2 = listPerson2.stream();
		
		Stream.concat(p1, p2).collect(Collectors.toList()).forEach(System.out::print);
	}
}
