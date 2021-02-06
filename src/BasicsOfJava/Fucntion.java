package BasicsOfJava;

public class Fucntion {
	
	static Fucntion fn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fn = new Fucntion();
	//	fn.Sum(50, 50);
	int x = fn.add();// fn.add is returning --> integer
	System.out.println(x);
	
	if(fn.add()>10)
	{
		System.out.println("True");
	}
	 
	 //System.out.println(fn.add());
	
	String nm = fn.Name();
	System.out.println(nm);

	}
	
	public static void Sum()
	{
		int x =10 , y=20,sum;
		
		
		sum = x+y;
		System.out.println(sum);
	}
	
	public static void Sum(int x, int y)
	{
	//	int x =10 , y=20,sum;
		int sum;
		
		
		sum = x+y;
		System.out.println(sum);
	}
	
	public static int add()
	{
		int x =10 , y=20,add;
		
		
		add = x+y;
		//System.out.println(sum);
		return add;
	}
	
	public static String Name()
	{
		String name = "haneesha";
		System.out.println(name);
		return name;
	}
	
	
}
