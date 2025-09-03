package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.println("How many people do you want register?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the ID:");
			int id = sc.nextInt();
			if (list.stream().filter(x -> x.getId() == id).findFirst().orElse(null) != null) {
				System.out.println("ERROR!");
				return;
			}
			
			System.out.println("Enter the salary:");
			Double salary = sc.nextDouble();
			list.add(new Person(name,salary,id));
		}

		for (Person p : list) {
			System.out.println(p.toString());
		}

		System.out.println("What the id to incrase the salary?");
		int choice = sc.nextInt();
		for (Person p : list) {
			if (p.getId() == choice) {
				System.out.println("How many dollars?");
				Double amount = sc.nextDouble();
				p.deposit(amount);

			}
		}
		for (Person p : list) {
			System.out.println(p.toString());
		}
		sc.close();
	}
}
