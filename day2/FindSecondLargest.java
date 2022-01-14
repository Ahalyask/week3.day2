package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(data));
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));

	}

}
