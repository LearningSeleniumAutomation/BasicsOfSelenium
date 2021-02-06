package BasicsOfJava;

public class ItTest1 implements InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceTest it;
		it = new ItTest1();
		it.display();
		it.set("himanshu");
		
			}

	@Override
	public
	 void display() {
		// TODO Auto-generated method stub
		System.out.println("inside the class");
		
	}

	@Override
	public void set(String name) {
		// TODO Auto-generated method stub
		System.out.println("inside the class1");
	}
	
	public void testSet(String name)
	{
		
	}
	
	public int Number(int number)
	{
		return 10;
	}
	

}
