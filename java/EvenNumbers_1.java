/* Write a program to list all even numbers less than or equal to the number n.  The value of n is given through command line as input to the program.*/

import java.util.Scanner;
	public class EvenNumbers_1{
		private int num;
		public EvenNumbers_1(int number){
			num = number;
		}
		public void printEven(){
			for(int i=2;i<=num;i+=2){
				System.out.println(i);
			}
		}
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();

		EvenNumbers_1 en = new EvenNumbers_1(number);
		en.printEven();
	}
	}
	
