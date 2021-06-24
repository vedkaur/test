package vedika;

public class Array1 {
	public static void main(String args[])
	{
		int array[]= {2,4,657,45,57,3,68,980,34,57};
		String array2[]= {"my","name","is","vedika"};
		for(int y:array)
		{
			if(y==980)
				break;
			System.out.println(y);
		}
		for(String z:array2)
		{
			if(z=="is")
				continue;
			System.out.println(z);
		}
	}

}
