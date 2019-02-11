import java.util.ArrayList;

public class ArrayListLab {
	
	private static ArrayList<String> band = new ArrayList<String>();
	
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
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
}
