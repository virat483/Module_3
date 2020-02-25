package Sprint1;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void display() {
		
		HashMap<String, String> ListOfTest = Map_Test.ListOfTest;
		
		for(Map.Entry m: ListOfTest.entrySet())
		{
			System.out.println(".......................");
			System.out.println("Test id"+m.getKey());
			System.out.println("Test name"+m.getValue());
		}
		
	}
}
