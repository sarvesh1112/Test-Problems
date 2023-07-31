import java.io.*;
import java.util.Scanner;
public class Problem3 {
	
	static boolean subset(int index, int[] arr, int n, int sum, int totalsum) {
		if(index == n) {
			if(sum == totalsum-sum) {
				return true;
			}
			return false;
		}
		sum+=arr[index];
		boolean left = subset(index+1,arr,n,sum,totalsum);
		sum-=arr[index];
		boolean right = subset(index+1,arr,n,sum,totalsum);
		if(left == true || right == true) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int totalsum = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			totalsum+=arr[i];
		}
		if(subset(0,arr,n,0,totalsum)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
