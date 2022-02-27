package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FoodTruckApp fta = new FoodTruckApp();

		FoodTruck[] trucks = new FoodTruck[5];

				int id = 1;
				String truckName = "";
				String foodType = "";
				int rating = 0;

		//fta.list();

		int i = 0;
		while (i < 6) {
			trucks[i] = new FoodTruck(id, truckName, foodType, rating);

			System.out.println("Enter the name of a food truck or enter \"quit\" to end search. ");
			trucks[i].setTruckName(input.nextLine());
			if (trucks[i].getTruckName().equalsIgnoreCase("quit")) {
				trucks[i] = null;
				break;
			}
			System.out.println("Enter the type of food this truck serves: ");
			trucks[i].setFoodType(input.nextLine());

			while (trucks[i].getRating() > 5 || trucks[i].getRating() < 1) {
				System.out.println("Rate this truck from 1 - 5");
				trucks[i].setRating(input.nextInt());
				input.nextLine();
				break;

			}
			System.out.println("You have created food truck " + trucks[i].getTruckName() + ".");
			i++;
			
		}
			
	}
}
	//System.out.println("ID Number: " + trucks[0].getID());

	//}
	//public void TrucksList(FoodTruck[] trucks) {
		
	//	int i = 0;
	//	while(trucks[i] != null && i < 6) {
	//		System.out.println(trucks[i].toString());
	//	}
		
	

//}
