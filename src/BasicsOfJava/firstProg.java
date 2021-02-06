package BasicsOfJava;

public class firstProg {
	 private String name = "haneesha";
	 private String name1 = "himanshu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		firstProg obj = new firstProg();
		obj.setName("Himanshu Kumar");
	String a=	obj.getName();
	System.out.println(a);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

}
