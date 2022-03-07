package com.dsproblems;

import java.util.*;

public class Permutation {
	/**
	 * swap - Swap Characters of array permute - calculate permutation of string
	 * 
	 */
	/**
	 * Swap Characters at different positions
	 * 
	 * @param a  - user input string
	 * @param i  - represent one position
	 * @param j- represent another position
	 * @return
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}

	/**
	 * 
	 * @param str    - user input string
	 * @param sindex - represents starting index of the array
	 * @param lindex - represents last index of the array
	 */
	public void permute(String str, int sindex, int lindex) {
		if (sindex == lindex)
			System.out.println(str);
		else {
			for (int i = sindex; i <= lindex; i++) {
				str = swap(str, sindex, i);
				permute(str, sindex + 1, lindex);
				str = swap(str, sindex, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print data: ");
		/**
		 * str - user input of array
		 */
		String str = sc.nextLine();

		int n = str.length();
		Permutation permutation = new Permutation();
		System.out.println("Print Permutation data: ");

		/**
		 * calling permutation method
		 */
		permutation.permute(str, 0, n - 1);
		sc.close();
	}

}
