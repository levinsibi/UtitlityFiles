package test;

import java.util.HashMap;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nc = 0;
		int[] a = { 2, 3, 4, 5, 6, 7, 2, 2, 4, 3, 5 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			if (map.containsKey(key)) {
				int freq = map.get(key);
				freq++;
				map.put(key, freq);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}
}
