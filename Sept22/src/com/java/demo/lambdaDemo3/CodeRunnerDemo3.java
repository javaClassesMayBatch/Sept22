package com.java.demo.lambdaDemo3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java.demo.lambdaDemo3.Person.Gender;

public class CodeRunnerDemo3 {
	public static void main(String[] a) {
		List<Person> listPersons = new ArrayList<>();

		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));

		/*
		 * for (Person p : listPersons) { System.out.println(p.getAge()); }
		 */

		/*
		 * listPersons.forEach(p -> { System.out.println(p.getAge()); });
		 */

		/*
		 * listPersons.stream().filter(p -> (p.getAge() > 25)).forEach(p -> {
		 * System.out.println(p); });
		 */

		listPersons.stream().filter(p -> (p.getAge() > 30 && p.getGender() == Gender.MALE)).map(p -> p.getEmail())
				.forEach(email -> System.out.println("Sending mail to " + email + "."));

		/*
		 * listPersons.forEach( new Consumer<Person>() {
		 * 
		 * @Override public void accept(Person p) {
		 * System.out.println(p.getAge());
		 * 
		 * }
		 * 
		 * } );
		 */
	}
}
