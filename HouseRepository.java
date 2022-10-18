package com.Houseproject;

import java.util.ArrayList;

public class HouseRepository {
	ArrayList<House> houses = new ArrayList<House>();
	
	public void add(House house) {
		houses.add(house);
	}

	public ArrayList<House> getHouses() {
		return houses;
	}
}