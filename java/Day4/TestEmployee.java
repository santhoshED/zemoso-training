import java.lang.*;

public class TestEmployee{
	public static void main(String[] args) {
		Employee emp1 = new Employee(5,"Hello");
		Employee emp2 = new Employee(39,"Santhosh");
		Employee emp3 = new Employee(5,"Hello");
		String emp1_ = "Hello";
		
		//using ==

		System.out.println(emp1 == emp3);

		//using equals

		System.out.println(emp1.equals(emp3));
	}
}