package Methods;

public class Demo3 {
	//method without parameter but with returntype
	public int sum()
	{
		int a=10,b=20;
		int result=a+b;
		return result;
		
	}

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		int total= obj.sum();//here we need to hold this returned
		//now total variable is holding the result value
		System.out.println(total);
		

	}

}
