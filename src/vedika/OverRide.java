package vedika;

 class OverRide1
{

	public void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("PARENT CLASS-OLD CAR");
	}
}


	
public class OverRide extends OverRide1
{
	public void add(int a, int b)
	{
		System.out.println(a-b);
		System.out.println("CHILD CLASS-NEW CAR");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRide obj= new OverRide();
		
		obj.add(10,20);
		
	}
		
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


