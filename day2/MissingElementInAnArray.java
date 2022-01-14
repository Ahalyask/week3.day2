package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(arr));
		Collections.sort(list);
		System.out.println(list);
		for(int i=1;i<list.size();i++) {
			if(i!= list.get(i-1)) {
				System.out.println(i);
				break;
			}
		}

	}

}
