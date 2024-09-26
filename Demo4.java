package com.april25.test1;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 != 0) {
				System.out.print(al.get(i) + " ");
			}

		}

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				System.out.print(al.get(i) + " ");

			}
		}

	}
}
