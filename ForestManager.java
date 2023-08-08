
package Test;
import java.io.*;
import java.util.*;



interface digitalTree{
	abstract int absorbsunlight(int hours);
	
	//void getTreeDetails();
}

class BinaryTree implements digitalTree{
	public int absorbsunlight(int hours) {
		return 2*hours;
	}
}

class QuantumTree implements digitalTree{
	public int absorbsunlight(int hours) {
		return 3*hours*hours;
	}
}

class NeuralTree implements digitalTree{
	public int absorbsunlight(int hours) {
		return hours*hours*hours;
	}
}
public class ForestManager {
	
	String type;
	int cnt;
	int energy;
	
	ForestManager(){
		
	}
	
	ForestManager(String type, int cnt){
		this.type = type;
		this.cnt = cnt;
	}
	ForestManager[] forests = new ForestManager[3];
	
	int produceenergyforforest(int hours) {
		BinaryTree b1 = new BinaryTree();
		QuantumTree q1 = new QuantumTree();
		NeuralTree n1 = new NeuralTree();
		int a = forests[0].energy = b1.absorbsunlight(hours);
		int b = forests[1].energy = q1.absorbsunlight(hours);
		int c = forests[2].energy = n1.absorbsunlight(hours);
		return a*forests[0].cnt + b*forests[1].cnt + c*forests[2].cnt;
	}
	
	void forestReport() {
		System.out.println("Tree"    +     "Count"       +       "EnergyProduced");
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum+=forests[i].energy;
			System.out.println(forests[i].type      +      forests[i].cnt       +       forests[i].energy);
		}
		System.out.println("Total Energy Produced : " + sum); 
	}
	
	void TestCase(){
		
		Scanner sc = new Scanner(System.in);
		int totalnumberoftrees = sc.nextInt();
		//ArrayList<ForestManager> forests = new ArrayList<ForestManager>();
		
		//int tree1 = 0, tree2 = 0, tree3 = 0;
		//int[] cnt = new int[3];
		forests[0].type = "Binary"; forests[0].energy = 0;
		forests[1].type = "Quantum"; forests[1].energy = 0;
		forests[2].type = "Neem"; forests[2].energy = 0;
		for(int i=0;i<totalnumberoftrees;i++) {
			String type = sc.next();
			if(type.compareTo("Binary") == 0) {
				forests[0].cnt++;
			}
			else if(type.compareTo("Quantum") == 0) {
				forests[1].cnt++;
			}
			else {
				forests[2].cnt++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForestManager fm = new ForestManager();
		fm.TestCase();
		
	}

}
