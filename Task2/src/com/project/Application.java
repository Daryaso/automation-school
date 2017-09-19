package com.project;

import java.util.Random;

public class Application {
	public static void main(String[] args) 
	{
	 	Student[] students = new Student[5];

	 	students[0] = new Student("Linda", "Hopf");
	 	students[1] = new Student("Harry", "Holt");
	 	students[2] = new Student("Mary", "Pop");
	 	students[3] = new Student("Gordon", "Ramsay");
	 	students[4] = new Student("Danny", "Colt");

	 	Random randomizer = new Random(); 
		int results[] = new int[5];

		for(int i = 0; i < results.length; i++) 	
		{
			results[i] = RandomResult();
		}

		System.out.println("Average Result: " + AverageRes(results));
	}

	private static double AverageRes(int[] results)
	{
		double sum = 0;
		for(int i = 0; i < results.length; i++) 	
		{
			sum += results[i];
		}

		return sum / results.length;
	}

	private static int RandomResult() 
	{
		return new Random().nextInt(5) + 1;
	}
}
