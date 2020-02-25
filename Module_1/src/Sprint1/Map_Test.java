package Sprint1;

import java.util.HashMap;

public class Map_Test {

	static HashMap<String, String> ListOfTest = new HashMap<String, String>();
	public static void main(String[] args) {
		
		
		
		
		//HashMap<String, String> entrySet(){
		
		ListOfTest.put("101", "CT Scan");
		ListOfTest.put("102", "Blood Test");
		ListOfTest.put("103", "ECG");
		ListOfTest.put("104", "MRI");
		ListOfTest.put("105", "X-ray");
		
		System.out.println("Initial Mappings are: ");
		Test.display();
	}
		
}