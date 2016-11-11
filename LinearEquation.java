import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearEquation extends Equation 
{
	private float a;
	private float b;
	@Override
	public void solve() throws IllegalCoefficientException
	{
		getUserCoefficients();
		if(a==0)
			throw new IllegalCoefficientException();
		float x=0;
			x=(-b)/a;
			printSolution(String.valueOf(x));
		
		
		
		
	}
	public void getUserCoefficients()
	{
		int count1=0;
		int count2=0;
		while(count1==0)
			try
			{	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter coefficient A:");
				a=sc.nextFloat();
				count1++;
			}
			catch (InputMismatchException i)
			{
				System.out.println("You must enter a number!");
			}
		while(count2==0)
			try
			{	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter coefficient B:");
				b=sc.nextFloat();
				count2++;
			}
			catch (InputMismatchException i)
			{
				System.out.println("You must enter a number!");
			}
	}
}
