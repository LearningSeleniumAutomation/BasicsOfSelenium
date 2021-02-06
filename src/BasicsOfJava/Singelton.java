package BasicsOfJava;

 class Singelton {

	private Singelton()
	{
		System.out.println("this is a sigelton class mean it can not have more than one object");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singelton sg = new Singelton();
		
	}

}

class TestSingelton
{
	
}