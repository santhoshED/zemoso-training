import java.lang.*;

public class Employee{
	private int id;
	private String name;

	public Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public boolean equals(Object other){
		Employee that = (Employee) other;
		return (this.id == that.id && this.name == that.name);
	}
	public int hashCode(){
		int hashCode =1;

	
		hashCode = 37 *hashCode + this.name.hashCode();
		return hashCode;
	}

}