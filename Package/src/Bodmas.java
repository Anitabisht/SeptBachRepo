
public class Bodmas {
	
	public int sum(int a, int b)
	{int c;
	 c=a+b;
	System.out.println("The sum is "+c);
	return c;
	}
	
	public int sub(int d, int e)
	{int f;
	f=d-e;
	System.out.println("The sub is "+f);
	return f;
	}
	
	public int multi(int m, int n)
	{int p;
	p=m*n;
	System.out.println("The multi is "+p);
	return p;
	}
	
	public  int divide(int x, int y)
	{int z;
	z=x/y;
	System.out.println("The divide is "+z);
	return z;
	}
	
	public static void main(String[] args) {
	
	Bodmas Display=new Bodmas();
	int sumresult=Display.sum(10,2);
	//System.out.println("The first answer is "+sumresult);
	int sumresult2=Display.sum(sumresult,2);
//	System.out.println("The second answer is "+sumresult2);
	int subresult=Display.sub(sumresult2,2);
//	System.out.println("The third answer is "+subresult);
	int multiresult=Display.multi(subresult,2);
//	System.out.println("The fourth answer is "+multiresult);
	int divide=Display.divide(multiresult,2);
//	System.out.println("The fifth answer is "+divide);
	
	
			
	
	}
	
	
	
}
