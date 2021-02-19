package oopTasks;

public class Person {

	public String name;

	public int age;

	public String jobtitle;

	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
	}

	public String speak() {
		return "Hello lovely weather we're having";
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void print() {
		System.out.println("Hi my name is " + this.name + ", I'm " + this.age + " and my job besides being cool is "
				+ this.jobtitle + " " + this.speak());
	}

}
