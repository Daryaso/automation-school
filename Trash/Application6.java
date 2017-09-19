import java.util.Random;

public class Application6 {
	public static void main(String[] args) 
	{
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
class Application7 {
	public static void main(String[] args) 
	{
		Ticket[] tickets = new Ticket[10];

		tickets[0] = new Ticket("01", "Question1");
		tickets[1] = new Ticket("02", "Question2");
		tickets[2] = new Ticket("03", "Question3");
		tickets[3] = new Ticket("04", "Question4");
		tickets[4] = new Ticket("05", "Question5");
		tickets[5] = new Ticket("06", "Question6");
		tickets[6] = new Ticket("07", "Question7");
		tickets[7] = new Ticket("08", "Question8");
		tickets[8] = new Ticket("09", "Question9");
		tickets[9] = new Ticket("10", "Question10");
	}
}
class Ticket {
	
	String id;
	String question;

Ticket(String id, String question) {
		this.id = new String(id);
		this.id = new String(question); 
		}
}
class Exam {
public static void main(String[] args)
	{
		Random randomizerTickets = new Random(); 
		int pickedTicket[] = new int[10];
		for(int i = 0; i < students.length; i++) 	
		{
			pickedTicket[i] = randomizerTickets.nextInt(10) + 1;
		}
			System.out.println(Student[5], pickedTicket[i]);
		
		int examResults[] = new int[5];
		double sum = 0;
		for(int i = 0; i < students.length; i++) 	
		{
			examResults[i] = randomizerResults.nextInt(5) + 1;
			sum = sum + examResults[i];
		}
				System.out.println(Student[5], examResults[i]);
				double average = 0;
		average = sum / students.length;
		System.out.println(average);
	}
}
