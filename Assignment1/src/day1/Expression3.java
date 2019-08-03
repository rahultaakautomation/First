package day1;

//(((((10/2)-2)+2)-2)*2)

public class Expression3 {
	
	
	public int div(int a,int b)
	{
	int c;
	c=a/b;
	return c;
	}
	
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
	
	public void mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("final result for expression 3 is "+c);
	}
	
	public static void main(String[] args) {
		
	Expression3 ref=new Expression3();
	
	int dv=ref.div(10, 2);
	int sb=ref.sub(dv, 2);
	int sm = ref.sum(sb, 2);
	int sb1=ref.sub(sm, 2);
	ref.mul(sb1, 2);
	}

}
