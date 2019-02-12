import java.util.ArrayList;

public class ArrayListMiniLab {

public static void main(String[] args)
{
	isInt(7);
}

public static void isInt(int n)	
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
	System.out.println(isPrime);
}
}
