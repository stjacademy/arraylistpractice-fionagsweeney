import java.util.ArrayList;

public class Notes {

	public static void main(String[] args) {
		/* array
		int[] grades = new int[2];
		
		grades[0] = 94;
		grades[1] = 96; 

		for(int i = 0; i < grades.length; i++)
		{
			System.out.println(grades[i]);
		}
		*/
		
		//arraylist
		
		//initiates arraylist
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		//adds values to arraylist in order
		grades.add(92);
		grades.add(100);
		grades.add(597);
		grades.add(89);
		
		//System.out.println(grades);
		//System.out.println("");
		
		//removes and prints
		//System.out.println("I removed the " + grades.remove(2));
		//System.out.println(grades);
		//System.out.println("");
		
		//adds 99 to location 1
		//grades.add(1, 99);
		//System.out.println("I added 99 to location 1");
		//System.out.println(grades);
		//System.out.println("");
		
		//replaces the number at 3 with 57
		//grades.set(3, 57);
		//System.out.println("I replaced 89 with 57");
		//System.out.println(grades);
		//System.out.println("");
		
		//for loop
		/*for(int i = 0; i < grades.size(); i++)
		{
		 */
		
		//for-each loop
		
		for(Integer num: grades)
		{
			System.out.println(num);
			//can't remove in a for-each loop: grades.remove(grades.get(0)); would throw error
		}
	}

}
