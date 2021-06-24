package javaExamples;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***PERSON DETAILS***");
		
		int age=27;
		int salary=50000;
		
		if(age==27)
		{
			if(salary==50000)
			{
				System.out.println("THE PERSON AGE IS 27 & SALARY IS 50000");
			}
			
			else
			{
				System.out.println("SALARY NOT MATCHED");
			}
		}
		
		else
		{
		
			System.out.println("AGE NOT MATCHED");
			
		}

	}

}
