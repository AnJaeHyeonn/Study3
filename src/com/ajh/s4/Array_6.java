package com.ajh.s4;

public class Array_6 {
	public static void main(String[] args) {
		int[] ar = { 3, 5, 1, 7, 4 };

		// 정렬
		// 1. 높은것에서부터 낮은 순으로 : 내림차순 -> desc
		// 2. 낮은것에서부터 높은 순으로 : 오름차순 -> ase

		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] < ar[i + 1]) {

			}
		}

		for (int idx = 0; idx < ar.length - 1; idx++) {
			for (int i = idx + 1; i < ar.length; i++) {
				if (ar[idx] < ar[i]) {
					int temp = ar[i];
					ar[i] = ar[idx];
					ar[idx] = temp;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
