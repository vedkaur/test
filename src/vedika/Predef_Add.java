package vedika;
import java.util.Scanner;

public class Predef_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a,b,c;
		
		System.out.println("ENTER VALUE OF A & B");
		
		Scanner obj = new Scanner(System.in);
		
		a= obj.nextInt();
		b= obj.nextInt();
		c=a+b;
		
		System.out.println("ADDITION OF A & B:" +c);

	}

}
