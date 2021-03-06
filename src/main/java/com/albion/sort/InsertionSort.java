package com.albion.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort extends BaseSort implements Sorter {

	public InsertionSort(int[] aInput) {
		super(aInput);
	}

	public int[] sort() {
		for (int i = 1; i < input.length; i++) {
			int value = input[i];
			int j = i;
			while (j > 0 && input[j - 1] > value) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = value;
		}
		return input;
	}

	public int[] sortV2() {
		List<Integer> list = new ArrayList<>();
		int len = input.length;
		// traverse each element in array
		for(int i = 0; i < len; i++){
			for(int j = 0; j < list.size(); j++){
				if(input[i] < list.get(j)){
					list.add(j, input[i]);
					break;
				}
			}
		}
		for(int r = 0; r < list.size(); r++){
			input[r] = list.get(r).intValue();
		}
		return input;
	}
}
