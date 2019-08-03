package day1;

public class Static {
	
	static int i=0;



public void increment()
{
	i=i+1;
}
public static void main(String[] args) {
	
	Static obj1=new Static();
	Static obj2 = new Static();
	
obj1.increment();
System.out.println(i);
obj1.increment();
System.out.println(i);
obj2.increment();
System.out.println(i);
}
}