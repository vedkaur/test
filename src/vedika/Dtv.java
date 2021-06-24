package vedika;

public class Dtv {
	
	int b=42;                       //INSTANCE VARIABLE
	
	static int empid=702;                          //STATIC VARIABLE
	
	public void m1()
	{
		int a=12;                  //LOCAL VARIABLE
		System.out.println("M1 EXECUTED");
		System.out.println(a);
		System.out.println(b);
		System.out.println(empid);

	}
	
	public void mAN()
	{
		System.out.println("M2 EXECUTED");
		System.out.println(b);
		System.out.println(empid);

	}
	
	public void m3()
	{
		System.out.println("M3 EXECUTED");
		System.out.println(b);
		System.out.println(empid);
	}
	
	public static void main(String args[])
	{
		System.out.println("DATA TYPE AND VARIABLE SHOULD BE ACCESS USING OBJECT");
		
		Dtv s = new Dtv();
		s.m1();
		s.mAN();
		s.m3();
		
	}
	
}
