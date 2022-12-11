package assignments;

import java.util.Scanner;

public class OrderFood {
	static int option;
	int amount = 0, totalNoOfDish = 0;
	float totalCost = 0f;
	static Scanner s = new Scanner(System.in);
	
	public void orderVegMenu() {
		System.out.println("Below are the dishes available currently to order : \n"
				         + "1. Paneer tikka - Rs. 120.00 (per item)\n"
				         + "2. Cashew pulao - Rs. 150.00 (per item)\n"
			           	 + "3. Veg fried rice - Rs. 130.00 (per item)\n"
				         + "4. Gobi 65 - Rs. 100.00 (per item)\n"
				         + "5. Veg. thali - Rs. 140.00 (per item)\n"
				         + "Please enter the option - ");

		int vegOpt = s.nextInt();
		String dish = "";
		int cost = 0;
		
		switch (vegOpt) {
		case 1: {
			dish = "Paneer tikka";
			cost = 120;
			break;
		}
		case 2: {
			dish = "Cashew pulao";
			cost = 150;
			break;
		}
		case 3: {
			dish = "Veg fried rice";
			cost = 130;
			break;
		}
		case 4: {
			dish = "Gobi 65";
			cost = 100;
			break;
		}
		case 5: {
			dish = "Veg. thali";
			cost = 140;
			break;
		}
		default:
			System.out.println("Only the available options can be entered");
		}
		
		if (vegOpt >=1 && vegOpt <=5) {
			System.out.println("\nPlease enter number of " + dish + " you would like to order");
			int numDish = s.nextInt();
			totalCost += cost*numDish;
			totalNoOfDish += numDish;
		}
	}
	
	public void orderNonVegMenu() {
		System.out.println("Below are the dishes available currently to order : \n"
		                 + "1. Chicken briyani - Rs. 200.00 (per item)\n"
				         + "2. Fish curry -  Rs. 150.00 (per item)\n"
				         + "3. Chicken 65 - Rs. 120.00 (per item)\n"
			             + "4. Mutton gravy -  Rs. 220.00 (per item)\n"
			             + "5. Chicken fried rice - Rs. 180.00 (per item)\n"
			             + "Please enter the option - ");
		int nonVegOpt = s.nextInt();
		String dish = "";
		int cost = 0;
		
		switch (nonVegOpt) {
		case 1: {
			dish = "Chicken briyani";
			cost = 200;
			break;
		}
		case 2: {
			dish = "Fish curry";
			cost = 150;
			break;
		}
		case 3: {
			dish = "Chicken 65";
			cost = 120;
			break;
		}
		case 4: {
			dish = "Mutton gravy";
			cost = 220;
			break;
		}
		case 5: {
			dish = "Chicken fried rice";
			cost = 180;
			break;
		}
		default:
			System.out.println("Only the available options can be entered");
		}
		
		if (nonVegOpt >=1 && nonVegOpt <=5) {
			System.out.println("\nPlease enter number of " + dish + " you would like to order");
			int numDish = s.nextInt();
			totalCost += cost*numDish;
			totalNoOfDish += numDish;
		}
	}
	
	public void calcTotalCost() {
		System.out.println("\nTotal cost: " + totalCost);
		System.out.println("GST tax: " + (6*totalCost)/100);
		
		int parDineCharge = 0;
		if (option == 1)
			parDineCharge = 30;
		else if (option == 2)
			parDineCharge = 10*totalNoOfDish;
		System.out.println("Parcel/Dine-in charge: " + parDineCharge);
		
		float totBillAmt = totalCost + (6*totalCost)/100 + parDineCharge;
		System.out.println("Total bill amount:  " + totBillAmt);
		
		float dis = 0;
		if (totBillAmt > 1500) 
			dis = ((totBillAmt*15)/100);
		else if (totBillAmt > 1000)
			dis = (totBillAmt/10);
		
		System.out.println("Discount: " + dis);
		System.out.println("Net bill amount: " + (totBillAmt-dis));
	}
	
	public static void main(String[] args) {
		OrderFood food = new OrderFood();
		String moreDish = "Y";
		
		System.out.println("Hello Welcome to Numpy Ninja restaurant !\n");
		System.out.println("Please select the service offering from below list :");
		System.out.println("Enter 1 for dine-in");
		System.out.println("Enter 2 for take away");
		option = s.nextInt();
		
		System.out.println("\nPlease select the category from the below list : ");
		System.out.println("Enter 1 for vegetarian\n" + 
		                   "Enter 2 for non-vegetarian");
		int cat = s.nextInt();
		System.out.println();
		
		while(moreDish.equalsIgnoreCase("Y")) {
			if (cat == 1) 
				food.orderVegMenu();
			else if (cat == 2)
				food.orderNonVegMenu();
			else
				System.out.println("Only 1 (for vegetarian) and 2 (for non-vegetarian) can be entered");
			
			System.out.println("\nWould you like to order one more dish ? [Y] or [N] - ");
			moreDish = s.nextLine();
			moreDish = s.nextLine();

			if (moreDish.equalsIgnoreCase("N")) {
				System.out.println("Would you like to order from other category ? [Y] or [N]  - ");
				moreDish = s.next();
				if (moreDish.equalsIgnoreCase("Y")) {
					if (cat == 1)
						cat = 2;
					else if (cat == 2)
						cat = 1;
				}
			}
		}
		
		food.calcTotalCost();
		System.out.println("Thank you ! Visit again !");

	}

}
