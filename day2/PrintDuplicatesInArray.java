package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length-1;i++) {
			boolean add = set.add(arr[i]);
			if(add !=true) {
				System.out.println(arr[i]);
			}
		}
	

	}

}
