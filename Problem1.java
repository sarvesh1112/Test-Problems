package Test;

interface AdvancedArithmentic{
	abstract int sumofdivisors(int n);
}
public class Problem1 implements AdvancedArithmentic{
	
	public int sumofdivisors(int n) {
		int sum = 0;
		for(int i=1;i*i<=n;i++) {
			if(n%i == 0) {
				if(i!=(n/i)) {
					sum+=(i + (n/i));
				}
				else {
					sum+=i;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 p1 = new Problem1();
		System.out.println(p1.sumofdivisors(6));

	}

}
