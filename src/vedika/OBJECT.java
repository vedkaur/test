
package vedika;

public class OBJECT {
	
	public void m1() 
	{
	System.out.println("M1 EXECUTED");
	}
	
	public void m2()
	{
		System.out.println("M2 EXECUTED");
	}
	
	public void m3()
	{
		System.out.println("M3 EXECUTED");
	}
	
	public static void main(String args[])
	{
		System.out.println("MAIN STATEMENT HAS TO BE PRINT FIRST");
	
	
	OBJECT N = new OBJECT();
	N.m1();
	N.m3();
	N.m2();
	
	}
	
	
}

