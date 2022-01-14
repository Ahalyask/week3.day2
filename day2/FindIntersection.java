package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		Integer[] a1 = {3,2,11,4,6,7};	 
		Integer[] a2 = {1,2,8,4,9,7};
		
		Set<Integer> aset = new HashSet<>();
		aset.addAll(Arrays.asList(a1));
		aset.retainAll(Arrays.asList(a2));
		System.out.println(aset);
		
	}

}
