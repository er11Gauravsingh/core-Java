package coreJava;

public class thisDemo 
{ 
	int a =2;
	public void getData() 
	{
		int a=3 ;
		System.out.println(a);
		System.out.println(this.a);
	// this refers to class object and scope of it lies in class level	
		
	}

	public static void main(String[] args) 
	{
		thisDemo td = new thisDemo();
		td.getData();
		

	}

}
