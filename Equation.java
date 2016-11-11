
public abstract class Equation implements Solvable
{
	public abstract void solve();
	
	public void printSolution(String solution)
	{
		System.out.println("The answer is: "+solution+"\n");
	}
}
