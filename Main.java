import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		LinearEquation l=new LinearEquation();
		QuadraticEquation q=new QuadraticEquation();
		System.out.println("This is a Quadratic/Linear equation calculator");
		System.out.println("Choose what you want to solve:");
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(count==0)
		{
			System.out.println("To calculate a Quadratic equation type in 1:");
			System.out.println("To calculate a Linear equation type in 2:");
			System.out.println("To end the program type in 3:");
			String choice=sc.nextLine();
			switch(choice)
			{
				case "1": 
					System.out.println("You chose Quadratic equation.");
					try
					{
						q.solve();	
					} catch (IllegalCoefficientException a)
					{
						System.out.println(a.getMessage());
					}
				
					break;
				case "2": 
					System.out.println("You chose Linear equation.");
					try
					{
						l.solve(); 
					} catch(IllegalCoefficientException a)
					{
						System.out.println(a.getMessage());
					}
					break;
				case "3": count++;
					break;
				default: System.out.println("Invalid choice!");
					break;
			}
		}
	}
}
