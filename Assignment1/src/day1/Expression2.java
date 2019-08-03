package day1;
//(((((10-2)+2)-2)*2)/2)
public class Expression2 {
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
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
		System.out.println(" result for Expression2 is "+c);
	
	}
	
	public static void main(String[] args) {
		
		Expression2 ref=new Expression2();
		
		int sb=ref.sub(10, 2);
		int sm= ref.sum(sb,2);
		int sb2=ref.sub(sm, 2);
		int mu=ref.mul(sb2, 2);
		ref.div(mu, 2);
	}

}
