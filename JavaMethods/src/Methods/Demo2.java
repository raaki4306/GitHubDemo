package Methods;

public class Demo2 {
	//with parameter and without returntype
	public void sum(int a,int b)
	{
		int total=a+b;
		System.out.println(total);
	}
	static void display(int a,float b)
	{
		float sum =(a+b);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.sum(10,20);
		Demo2.display(10,20.50f);
		obj.sum(20,30);
		Demo2.display(30, 30.50f);

	}

}
