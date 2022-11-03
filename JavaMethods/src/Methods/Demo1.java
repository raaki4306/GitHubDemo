package Methods;

public class Demo1 {
	//without returntype and without parameter
	public void sum()
	{
		int a=10,b=20;
		int total=a+b;
		System.out.println(total);
	}
	static void display()
	{ 
		System.out.println("This is java method");
	}

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
				obj.sum();
				Demo1.display();
		

	}

}
