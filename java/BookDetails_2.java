import java.util.*;
public class BookDetails_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book_2[] BookArray = new Book_2[3];
		for(int i=0;i<BookArray.length;i++){

			System.out.println("Enter BookNo:");
			int bookNo = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter Title:");
			String title = scanner.nextLine();

			System.out.println("Enter Author");
			String author = scanner.nextLine();
			
			System.out.println("Enter Price");
			float price = scanner.nextFloat();
		
			BookArray[i] = new Book_2(bookNo,title,author,price);
		}
		EngineeringBook_2 RDS = new EngineeringBook_2(96,"adventures of wandering","kosgi",89,"mechanical");
		System.out.println(RDS.getBookCount()); 
		while(true){
			System.out.println("Search the book number:");
		int searchBookNo = scanner.nextInt();
		boolean found = false;
		for(int i=0;i<BookArray.length;i++){
			if(BookArray[i].getBookNo() == searchBookNo){
				System.out.println(BookArray[i].toString());
				found=true;
				break;
			}
		}
		if(!found)
		System.out.println("Doesnt exist");
		}
		
	}

}