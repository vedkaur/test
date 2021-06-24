package javaExamples;

public class Else_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GRADE DETAIL:");
		int studentMark=92;
		
		if(studentMark<92)
		{
			System.out.println("IF CONDITION IS TRUE");
		}
		
		else if(studentMark<=92)
		{
			System.out.println("STUDENT MARK IS 92");
			System.out.println(studentMark);
		}
		
		else if(studentMark==92)
		{
			System.out.println("STUDENT MARK IS 92");
		}
		
		else
		{
			System.out.println("STUDENT MARK IS NOT FOUND");
		}

	}

}
