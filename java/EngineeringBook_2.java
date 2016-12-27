import java.util.*;

public class EngineeringBook_2 extends Book_2{
	private String category;

	public EngineeringBook_2(int bookNo,String title, String author,float price, String category){
		super(bookNo,title,author,price);
		this.category = category;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String value){
		this.category = value;
	}
}