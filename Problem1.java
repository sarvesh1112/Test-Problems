import java.io.*;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting distance :");
		while(true) {
			int distance = sc.nextInt();
			if(distance < 5 || distance > 8) {
				System.out.println("Sorry Choose between 5Km and 8Km");
			}
			else {
				int i;
				for(i=distance;i>=1;i--) {
					System.out.println("Distance to run : " + i);
					if(i == distance-1) {
						System.out.println("Good Start Keep it up");
					}
					else if(i <= 2) {
						System.out.println("Almost there");
					}
				}
				if(i == 0) break;
			}
		}
		System.out.println("Done for the day");

	}

}
