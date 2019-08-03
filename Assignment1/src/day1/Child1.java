package day1;

public class Child1 extends Parent {
	
	public void second()
	{
		System.out.println("i am child 1");
	}
	
public static void main(String[] args) {
	
	Child1 obj= new Child1();
	obj.first();
	obj.second();
}
}
