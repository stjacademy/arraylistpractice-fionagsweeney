import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMiniLab {

private static ArrayList<Integer> factors = new ArrayList<Integer>();
private static ArrayList<Integer> compFactors = new ArrayList<Integer>();

public static void main(String[] args)
{
	getFactors();
	keepComps();
}

public static void getFactors()
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer");
	int num = input.nextInt();
	for(int i = 2; i < num-1; i++)
	{
		if(num % i == 0 )
		{
			factors.add(i);
		}
	}
	System.out.println("Factors: " + factors);
}

public static void keepComps()
{
	for(int i = 0; i < factors.size(); i++)
	{
		int newNum = factors.get(i);
		if(isPrime(newNum) == false)
		{
			compFactors.add(newNum);
		}
	}
	System.out.println("Composite Factors: " + compFactors);
}

public static boolean isPrime(int n)	
{
	int result = 1;
	boolean isPrime = false;
	for(int i = n-1; i > 0; i--)
	{
		result = result*i % n;
	}
	if(result % n == n-1)
	{
		isPrime = true;
	}
	return isPrime;
}
}
