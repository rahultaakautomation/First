package day1;

public class Test_1 {

		int age;
		int roll_no;
	public void display1()
	{
		System.out.println("welcome in core java class");
		
	}

	public void display2()
	{
		System.out.println("welcome in selenium class");
		
	}

	public static void main(String[] args)
	{
	Test_1 rahul=new Test_1();
	rahul.display1();
	rahul.display2();
	rahul.age = 18;
	rahul.roll_no=100;
	System.out.println(rahul.age);
	System.out.println(rahul.roll_no);
	}
	
}
