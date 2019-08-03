package day1;
//(((((10+2)-2)+2)*2)/2)
public class Expression1 {
	
	public int sum(int a,int b)
	{
	int c;
	c=a+b;
	return c;
	
}

	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	
	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	
	public void div(int a,int b)
	
	{
		int c;
		c=a/b;
		System.out.println("result of expression 1 is " +c);
	}
	
	public static void main(String[] args) {
		
		Expression1 ref = new Expression1();
		int x= ref.sum(10, 2);
		int y=ref.sub(x, 2);
		int z=ref.sum(y, 2);
		int z1=ref.mul(z, 2);
		ref.div(z1, 2);
		
		
				
		
	}
}
