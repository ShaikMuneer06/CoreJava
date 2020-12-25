package corejava;

import java.util.Scanner;
class Food{
public  void Menu() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Vegetarian\n2.Non-Vegetarian\n3.Exit\nChoose the type of menu");
    int option = sc.nextInt();
    switch(option){
    case 1:
    	Vegetarian();
    break;
    case 2:
    	Non_Vegetarian();
    break;
    case 3 :
    	 System.out.println("Thank You");
    	 break;
    default:
    	System.out.println("Choose only number");
    }
}
private void Vegetarian() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Meals-100/-\n2.Veg-Biriyani-80/-\n3.Idly-30/-");
	System.out.println("Order according to the menu");
	int order = sc.nextInt();
	System.out.println("Enter the number of items");
	int num = sc.nextInt();
	switch(order){
	case 1 :
		int bill = 100*num;
		System.out.println("TotalBill:"+bill);
		System.out.println("Anything Extra You need to Order");
		Menu();
		break;
	case 2 :
		int bill1 = 80*num;
		System.out.println("TotalBill:"+bill1);
		System.out.println("Anything Extra You need to Order");
		Menu();
		break;
	case 3 :
		int bill2 = 30*num;
		System.out.println("TotalBill:"+bill2);
		System.out.println("Anything Extra You need to Order");
		Menu();
	break;
	default : 
		System.out.println("Choose only numbers");
		
	}
}
private void Non_Vegetarian() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.SpecialBiriyani-220/-\n2.Dum-Biriyani-300/-\n3.LolipopBiriyani-285/-");
	System.out.println("Order according to the menu");
	int order = sc.nextInt();
	System.out.println("Enter the number of items");
	int num = sc.nextInt();
	switch(order){
	case 1 :
		int bill = 220*num;
		System.out.println("TotalBill:"+bill);
		System.out.println("Anything Extra You need to Order");
		Menu();
		break;
	case 2 :
		int bill1 = 300*num;
		System.out.println("TotalBill:"+bill1);
		System.out.println("Anything Extra You need to Order");
		Menu();
		break;
	case 3 :
		int bill2 = 285*num;
		System.out.println("TotalBill:"+bill2);
		System.out.println("Anything Extra You need to Order");
		Menu();
	break;
	default : 
		System.out.println("Choose only numbers");	
	}
}
}
public class Food_Billing {
public static void main(String [] args){
	Food f = new Food();
	f.Menu();
}
}
