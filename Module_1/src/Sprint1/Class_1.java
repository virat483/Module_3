package Sprint1;

import java.util.Scanner;

public class Class_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id=100;
		String name;
		get_test object=new get_test();
		
		for(int i=0;i<5;i++)
		{
			object.setTestId(id=id+1);
		}
	}
}
