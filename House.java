package com.Houseproject;

public class House {
	int number;
	String name;
	String color;
	long Price;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		this.Price = price;
	}

	@Override
	public String toString() {
		return "House [number=" + number + ", name=" + name + ", color=" + color + ", Price=" + Price + "]";
	}

	
}