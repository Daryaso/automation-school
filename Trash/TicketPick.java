import java.util.Random;

public class TicketPick {
	public static void main(String[] args)
	{
		Random randomizerTickets = new Random(); 
		int ticketPicked[] = new int[10];
				for(int i = 0; i < students.length; i++) 	
		{
			ticketPicked[i] = randomizerTickets.nextInt(10) + 1;
				System.out.println(ticketPicked[i]);
					}
				
		Random randomizer = new Random(); 
		int results[] = new int[5];
				for(int i = 0; i < results.length; i++) 	
		double sum = 0;
		results[i] = randomizer.nextInt(5) + 1;
		sum = sum + results[i];
			System.out.println(sum);

		double average = 0;
		average = sum / results.length;
			System.out.println(average);
	}
}
class 1 {
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
