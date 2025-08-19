package basic ;

public class Method 
{
	int a = 55;
	int b = 86;
	
		void addition()
		{
			int sum = a+b;
			System.out.println("Addition Of nos. is:"+sum);
		}
	

	public static void main(String[] args) 
	{
		Method obj = new Method();
		obj.addition();
		
	}

}
