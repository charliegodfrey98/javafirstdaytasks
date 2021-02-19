package oopTasks;

import java.util.ArrayList;

public class HumanApp {

	public static void main(String[] args) {
		/*
		 * Person human1 = new Person("jeff", 184, "lion counselor"); Person human2 =
		 * new Person("mr flooples", 2000, "space wizard horse trainer");
		 * 
		 * printPerson(human1); printPerson(human2);
		 */
		Person human1 = new Person("jeff", 184, "lion counselor");

		Person[] humans = { human1 };

		ArrayList<Person> humanlist = new ArrayList<>();

		humanlist.add(human1);
		humanlist.add(new Person("jeff", 184, "lion counselor"));
		humanlist.add(new Person("mr flooples", 2000, "space wizard horse trainer"));
		humanlist.add(new Person("Boomey", 200, "earth monkey"));
		humanlist.add(new Person("mr blobby", 800000, "built to annoy"));
		humanlist.add(new Person("chillies", 1, "eat me"));

		System.out.println(humanlist.size());

		for (int i = 0; i < humanlist.size(); i++) {
			Person currentHuman = humanlist.get(i);
			currentHuman.print();
		}

	}

}
