import java.util.Random;

public class AverageRes {

	public static void main(String[] args)
	{
		Random randomizer = new Random(); 
		int results[] = new int[5];
		double sum = 0;
		for(int i = 0; i < results.length; i++) 	
		{
			results[i] = randomizer.nextInt(5) + 1;
			sum = sum + results[i];
		}
		double average = 0;
		average = sum / results.length;
		System.out.println(average);
	}
}
class Application {
	public static void main(String[] args) {
	 	Student[] students = new Student[5];

	 	students[0] = new Student("Linda", "Hopf");
	 	students[1] = new Student("Harry", "Holt");
	 	students[2] = new Student("Mary", "Pop");
	 	students[3] = new Student("Gordon", "Ramsay");
	 	students[4] = new Student("Danny", "Colt");
	}
}
class Student {
	String name;
	String lastName;

	Student(String name, String lastName) {
		this.name = new String(name);
		this.lastName = new String(lastName);
	} 
}
