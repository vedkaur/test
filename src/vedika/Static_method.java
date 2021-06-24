package vedika;

public class Static_method {
	
	//static method call by classname
	
	public static void sm()
	{
		int a=33;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("MAIN STATEMENT EXECUTED");

		Static_method.sm();
	}

}
