package com.Houseproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HouseProject {

	public void printHouses(HouseRepository houseRepository) {
		ArrayList<House> houses = houseRepository.getHouses();
		Iterator<House> houseIterator = houses.iterator();
		while (houseIterator.hasNext()) {
			System.out.println(houseIterator.next());
		}
	}

	public House highestPrice(ArrayList<House> houseList) {
		House hightestPricedHouse = houseList.get(0);
		for (int i = 1; i < houseList.size(); i++) {
			House tempHouse = houseList.get(i);

			// System.out.println(i);
			// System.out.println(hightestPricedHouse.getPrice());
			// System.out.println(tempHouse.getPrice());

			if (hightestPricedHouse.getPrice() < tempHouse.getPrice()) {
				hightestPricedHouse = tempHouse;
			}
		}
		return hightestPricedHouse;
	}
	
	public void lesserPriceHouse(ArrayList<House> houseList) {
		System.out.println("Write the price to find the below prices");
		try (Scanner scan = new Scanner(System.in)) {
			long selectPrice = scan.nextLong();
			ArrayList<House> lesserPrice = new ArrayList<House>();
			for(int i = 0; i < houseList.size(); i++) {
				if(houseList.get(i).getPrice() < selectPrice) {
					lesserPrice.add(houseList.get(i));
				}
			}
			System.out.println(lesserPrice);
		}
	} 

	public void addHouses(HouseRepository houseRepository) {
		House house1 = new House();
		house1.setNumber(1);
		house1.setName("Prakash");
		house1.setColor("Gray");
		house1.setPrice(4000000);

		House house2 = new House();
		house2.setNumber(2);
		house2.setName("Rajat");
		house2.setColor("Green");
		house2.setPrice(5000000);

		House house3 = new House();
		house3.setNumber(3);
		house3.setName("Rakesh");
		house3.setColor("Red");
		house3.setPrice(8000000);

		House house4 = new House();
		house4.setNumber(4);
		house4.setName("Pushpak");
		house4.setColor("Yellow");
		house4.setPrice(6000000);

		House house5 = new House();
		house5.setNumber(5);
		house5.setName("Rupesh");
		house5.setColor("Bllue");
		house5.setPrice(7000000);

		houseRepository.add(house1);
		houseRepository.add(house2);
		houseRepository.add(house3);
		houseRepository.add(house4);
		houseRepository.add(house5);
	}

	public static void main(String[] args) {
		HouseProject houseProject = new HouseProject();
		HouseRepository houseRepository = new HouseRepository();
		houseProject.addHouses(houseRepository);
		houseProject.printHouses(houseRepository);
		House maxHousePrice = houseProject.highestPrice(houseRepository.houses);
		System.out.println("Haighest price is  :  " + maxHousePrice.Price);
		houseProject.lesserPriceHouse(houseRepository.houses);
	}
}
