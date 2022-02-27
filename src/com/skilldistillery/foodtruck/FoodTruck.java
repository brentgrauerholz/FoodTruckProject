package com.skilldistillery.foodtruck;

public class FoodTruck {
	private int id;
	private String truckName;
	private String foodType;
	private int rating;
	private static int truckCounter = 1;
	
	public FoodTruck(int id, String tName, String fType, int rat) {
	    id = truckCounter;
	    truckCounter++;
	    truckName = tName;
	    foodType = fType;
	    rating = rat;
	  }
	
	
	public FoodTruck() {
		
	}
	@Override
	public String toString() {
		return "Truck ID-" + id + "\tname-" + truckName + "\tfood-" + foodType + "\trate-" + rating;
	}

	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getTruckName() {
		return truckName;
	}
	
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
