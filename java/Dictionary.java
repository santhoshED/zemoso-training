/* A set of 5 words is given. Write a program to reverse each word and arrange the resulting words in alphabetical order */

import java.util.*;

public class Dictionary{
	private final String[] unsorted = 
	{"himaja","aamani","shivani","akhilesh","santhosh"};
	private String[] sorted;

	private String reverseString(String word){
		int length = word.length();
		String result = "";
		for(int i=0;i<length;i++){
			result = result + word.charAt(length-1-i);
		}
		return result;
	}
	private String[] reverse(){
		for (int i=0;i<unsorted.length;i++){
			unsorted[i] = this.reverseString(unsorted[i]);
		}
		return unsorted;
	}

	private void diction(String[] words){
		Arrays.sort(words);
		for(int i=0;i<words.length;i++){
			System.out.print(words[i]+" ");
		}
	}
	public static void main(String[] args) {
		Dictionary dy = new Dictionary();
		String[] reverseUnsorted = dy.reverse();
		dy.diction(reverseUnsorted);
		
			
	}
}