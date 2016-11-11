import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation extends Equation 
{
	private float a;
	private float b;
	private float c;

	@Override
	public void solve() throws IllegalCoefficientException
	{
		getUserCoefficients();
		float x=0;
		float x1=0;
		float x2=0;
		if(a==0)
			throw new IllegalCoefficientException();
		float d=(b*b)-(4*a*c);
		if(d==0)
		{
			x=(-b)/(2*a);
			printSolution("x1=x2="+x);
		}
		if(d>0)
		{
			x1=((-b)+(float)Math.sqrt(d))/(2*a);
			x2=((-b)-(float)Math.sqrt(d))/(2*a);
			printSolution("x1="+String.valueOf(x1)+"\nx2="+String.valueOf(x2));
		}
		if(d<0)
			printSolution("There are no real solutions!");
		
		
	}
	public void getUserCoefficients()
	{
		int count1=0;
		int count2=0;
		int count3=0;
		while(count1==0)
		{
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

		while(count3==0)
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter coefficient C:");
			c=sc.nextFloat();
			count3++;
		}
		catch (InputMismatchException i)
		{
			System.out.println("You must enter a number!");
		}
	}

}
