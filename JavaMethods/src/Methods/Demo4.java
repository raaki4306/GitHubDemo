package Methods;

public class Demo4 {
	//method with parameter and with returntype
	int sum(int a,char b)
	{
		int result=a+b;//a,b are ascivalues
		return result;
		
	}


	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		int total=obj.sum(100,'m');
		System.out.println(total);
		

	}

}
