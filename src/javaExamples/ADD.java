package javaExamples;

import java.util.Scanner;

public class ADD {
	
	public static void main(String args[])
	{
		int a,b;
       Scanner obj= new Scanner(System.in);
		
		System.out.println("ENTER VALUE OF A");
		a=obj.nextInt();
		System.out.println("ENTER VALUE OF B");
		b=obj.nextInt();
		
		int c=a+b;

		System.out.println("output:"+c );

		
		
	}		

}
