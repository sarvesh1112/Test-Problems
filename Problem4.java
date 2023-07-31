import java.io.*;
import java.util.Scanner;
public class Problem4 {
	static int level = 1000000;
	static void minjumps(int index, int[] arr, int cnt, int n) {
		if(index == n) {
			level = Math.min(level, cnt);
		}
		for(int i=arr[index-1];i>=1;i--) {
			if(index+i <= n) {
				minjumps(index+i,arr,cnt+1,n);
			}
		}
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		minjumps(1,arr,0,n);
		System.out.println("Minimum number of jumps is : " + level);
	}

}
