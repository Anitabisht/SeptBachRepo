package anitatest;

public class Anitaclass {
	
	int empid;
	int salary;
	
	public void method1()
	{
		System.out.println("the empid is " );
	}
	public void method2()
	{
		System.out.println("the name is " );
	}
public static void main(String[] args)
{
	
	Anitaclass obj=new Anitaclass();
	obj.method1();
	obj.method2();
	obj.empid=12;
	System.out.println();
	obj.salary=1000;
    System.out.println();
}

}
