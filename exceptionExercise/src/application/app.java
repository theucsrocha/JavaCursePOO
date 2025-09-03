package application;

import java.util.Scanner;

import entites.Accont;
import exceptions.DomainException;

public class app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number accont:");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the Holder:");
		String holder = sc.nextLine();
		
		System.out.println("Enter the balance:");
		double balance = sc.nextDouble();
		
		System.out.println("Enter the withdraw Limit:");
		double withdrawLimit = sc.nextDouble();
		
		Accont accont = new Accont(number,holder,balance,withdrawLimit);
		
		
		try {
			System.out.println("Enter the amount of deposit:");
			accont.deposit(sc.nextDouble());
			
			System.out.println("Enter the amount of withdraw:");
			accont.withdraw(sc.nextDouble());
		}
		catch(DomainException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(accont);
		}

	}

}
