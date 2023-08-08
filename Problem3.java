package Test;
import java.io.*;
import java.util.*;
interface MenuItem{
	abstract public int pricing(int qty, int p);
}

class Sandwich implements MenuItem{
	
	String name;
	int price;
	
	Sandwich(){
		
	}
	Sandwich(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int pricing(int qty, int price) {
		return qty*price;
	}
}

class Salad implements MenuItem{
	
	String name;
	int price;
	Salad(){
		
	}
	Salad(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int pricing(int qty, int price) {
		return qty*price;
	}
}

class Drinks implements MenuItem{
	String name;
	int price;
	Drinks(){
		
	}
	Drinks(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int pricing(int qty, int price) {
		return qty*price;
	}
}

class Trio implements MenuItem{
	public int pricing(int qty, int price) {
		return qty*price;
	}
}
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Sandwich> sandwich = new ArrayList<Sandwich>();
		ArrayList<Salad> salad = new ArrayList<Salad>();
		ArrayList<Drinks> drinks = new ArrayList<Drinks>();
		
		sandwich.add(new Sandwich("CheeseBurger", 40));
		sandwich.add(new Sandwich("ChickenBurger", 70));
		sandwich.add(new Sandwich("VegBurger", 30));
		
		salad.add(new Salad("Fruit Salad", 80));
		salad.add(new Salad("Veg Salad", 20));
		salad.add(new Salad("Paneer Salad", 100));
		
		drinks.add(new Drinks("Pepsi", 60));
		drinks.add(new Drinks("Sprite", 65));
		drinks.add(new Drinks("Bovonto", 30));
		
		System.out.println("Choose 1 for Trio 0 for nothing : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter id of each category : ");
			System.out.println("Enter Sandwich Choice : ");
			int sandchoice = sc.nextInt();
			int p1 = sandwich.get(sandchoice).price;
			System.out.println("Enter Salad Choice : ");
			int saladchoice = sc.nextInt();
			int p2 = salad.get(saladchoice).price;
			System.out.println("Enter Drinks Choice : ");
			int drinkchoice = sc.nextInt();
			int p3 = drinks.get(drinkchoice).price;
			System.out.println("Give the number of trios : ");
			int tot = sc.nextInt();
			int mx = Math.max(p1,Math.max(p2, p3));
			Trio t = new Trio();
			System.out.println("Price is : " + t.pricing(tot, mx));
		}
		else if(choice == 2) {
			System.out.println("Give the number of items : ");
			int tot = sc.nextInt();
			int sandchoice = sc.nextInt();
			int p1 = sandwich.get(sandchoice).price;
			Sandwich s1 = new Sandwich();
			System.out.println("Price is : " + s1.pricing(tot, p1));
		}
		else if(choice == 3) {
			System.out.println("Give the number of items : ");
			int tot = sc.nextInt();
			int sandchoice = sc.nextInt();
			int p1 = salad.get(sandchoice).price;
			Salad s1 = new Salad();
			System.out.println("Price is : " + s1.pricing(tot, p1));
		}
		else {
			System.out.println("Give the number of items : ");
			int tot = sc.nextInt();
			int sandchoice = sc.nextInt();
			int p1 = drinks.get(sandchoice).price;
			Drinks s1 = new Drinks();
			System.out.println("Price is : " + s1.pricing(tot, p1));
		}
		
	}

}
