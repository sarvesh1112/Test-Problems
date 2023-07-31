import java.io.*;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int mx = arr[0];
		int largemax = -1000000;
		for(int i=1;i<n;i++) {
			mx = Math.max(arr[i], arr[i]+mx);
			largemax = Math.max(mx,largemax);
		}
		System.out.println(largemax);
	}

}
