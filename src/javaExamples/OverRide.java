package javaExamples;

 class OverRide2
 {
	 public void add(int a,int b, int c)
	 {
		 System.out.println(a+b+c);
		 System.out.println("PARENT CLASS");
	 }
 }
 
 class OverRide1
 {
	 public void add(int a,int b,int c)
	 {
		 System.out.println(a-b-c);
		 System.out.println("PARENT CLASS 1");
	 }
 }
 

 
 public class OverRide extends OverRide2
 {
	 public void add(int a,int b,int c)
	 {
		 System.out.println(a*b*c);
		 System.out.println("CHILD CLASS");
	 }
 
 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRide obj=new OverRide();
		obj.add(2, 3, 4);

	}

 }
