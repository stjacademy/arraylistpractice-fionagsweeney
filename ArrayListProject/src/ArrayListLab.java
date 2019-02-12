import java.util.ArrayList;

public class ArrayListLab {
	
	private static ArrayList<String> band = new ArrayList<String>();
	private static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
		//q5a();
		//q5b();
		//q6();
		q7();
	}
	
	public static void q1()
	{	
		band.add("Lindsey");
		band.add("Mick");
		band.add("Stevie");
		band.add("Danny");
		band.set(3,  "Christine");
	
		System.out.println(band);
	}
	
	public static void q2()
	{
		band.add("Lindsey");
		band.add("Mick");
		band.add("Stevie");
		band.add("Peter");
		band.remove(3);
		band.add(2, "Christine");
		
		System.out.println(band);
	}
	
	public static void q3()
	{
		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Dave");
		band.add("Christine");
		band.add(band.remove(2));
		band.set(0,band.get(4));

		System.out.println(band);
	}
	
	public static void q4()
	{
		band.add("Paul"); 
		band.add("Ringo"); 	
		band.add("John"); 
		band.add("George"); 
		
		String removed = band.remove(band.size()-1);
		
		System.out.println(removed);
		System.out.println(band);
	}
	
	public static void q5a()
	{
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(12);
		
		for(int i = nums.size()-1; i >= 0; i--)
		{
			System.out.print(nums.get(i) + " ");
		}
	}
	
	public static void q5b()
	{
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(12);
		
		for(int i= 0; i < nums.size(); i++)
		{
			nums.remove(i); 
		}
		
		System.out.println(nums);
	}
	
	public static void q6()
	{
		band.add("Paul"); 
		band.add("Pete"); 
		band.add("John"); 
		band.add("George"); 
		band.remove(1); 
		
		System.out.println ("Band: " + band); 
		System.out.println ("Size of the band: " + band.size());

	}
	
	public static void q7()
	{
		
	}
}
