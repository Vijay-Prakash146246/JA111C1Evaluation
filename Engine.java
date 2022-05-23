//Question 3
public class Engine {
	int rmp=1000;
	int Power=110;
	String manufacturer="tata";
	Boolean hasTurbo;
	public static void f1()
	{
		Engine e1 = new Engine();
		e1.hasTurbo=true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		Engine c2 = new Engine();
		System.out.println(c1.model);
		System.out.println(c1.companyName);
		System.out.println(c1.Color);
	}

}
