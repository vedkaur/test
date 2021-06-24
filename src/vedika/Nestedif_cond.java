package vedika;

public class Nestedif_cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=30;
		if(a>10)
		{
			if(b>30)
			{
				System.out.println("a VALUE IS 10 & b VALUE IS 30");
			}
			else 
			{
				System.out.println("SECOND CONDITION IS FAIL");
			}
		}
		else 
		{
			System.out.println("FIRST CONDITION IS FAIL");
		}
	}

}
