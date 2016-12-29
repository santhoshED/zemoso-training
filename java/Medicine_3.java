import java.util.*;
public abstract class Medicine_3{
	private int price;
	private String expiryDate;

	public void getDetails(){
		System.out.println(price);
		System.out.println(expiryDate);
	}
	public abstract void displayLabel();

}

