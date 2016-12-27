/* Create an array of integers by reading values from the user. Display the sum and average of the integers. Also, display the number of values less than the average.*/
import java.util.Scanner;
import java.util.*;

public class IntegerArray_1{
	List<Integer> myList = new ArrayList<Integer>();
	
	public void getNumbers(){
		for(int i=0;i<myList.size();i++){
			System.out.print(myList.get(i)+" ");
		}
		System.out.println("  is the array");
	}
	public double getAverage(){
		int sum = 0;
		for(int i=0;i<myList.size();i++){
			sum+=myList.get(i);
		}
		double avg = ((double)sum)/(double)myList.size();
		System.out.println(avg + "  is the average");
		return avg;
	}
	public void getnumbersless(double avg){
		for(int i=0;i<myList.size();i++){
			if(myList.get(i)<avg)
				System.out.print(myList.get(i)+" ");
		}
		System.out.println("are the numbers less than average");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IntegerArray_1 InAr = new IntegerArray_1();
		while(true){
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		InAr.myList.add(number);
		InAr.getNumbers();
		double avg = InAr.getAverage();
		InAr.getnumbersless(avg);
		}	
	}
}