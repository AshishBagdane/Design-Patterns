package patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items;
	
	public Meal() {
		// TODO Auto-generated constructor stub
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float totalCost = 0.0f;
		for (Item item : items) {
			totalCost += item.price();
		}
		return totalCost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println(item.name() + " is packed in a " + item.packing().pack() + " and has a cost " + item.price() + " rupees.");
		}
	}
}
