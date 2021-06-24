package vedika;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int a,b;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("ENTER FIRST NUMBER:");
		a= obj.nextInt();
		
		System.out.println("ENTER SECOND NUMBER:");
        b= obj.nextInt();
		
		System.out.println("ENTER OPTION:");

       int c= obj.nextInt();
		System.out.println("OUTPUT IS:" );


        
        switch (c)
        {
        	case 1:
        		System.out.println(a+b);

        		break;
        		
        	case 2:
        		System.out.println(a-b);

        		break;
        		
        	case 3:
        		System.out.println(a*b);

        		break;
        		
        	case 4:
        		System.out.println(a/b);

        		break;
        		
        		
        		
        	default:
        	
        		System.out.println("INVALID OPTION");
        		
        	
        }

	}

}
