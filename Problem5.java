import java.io.*;

import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		String arr[] = {"John Wright", "John Cena", "Bharat", "Albert"};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			String temp;
			for(int j=i+1;j<n;j++) {
				if(arr[j].compareTo(arr[i]) < 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
