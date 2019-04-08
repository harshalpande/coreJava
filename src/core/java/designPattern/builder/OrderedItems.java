package core.java.designPattern.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderedItems {

	List<FoodItem> itemsOrderedList = new ArrayList<>();

	public void addItems(FoodItem item) {
		itemsOrderedList.add(item);
	}

	public float getCost() {
		float cost = (float) itemsOrderedList.stream().map(item -> item.price())
				.mapToDouble(price -> price.floatValue()).sum();
		return cost;
	}

	public void showItems() {
		for (Iterator<FoodItem> iterator = itemsOrderedList.iterator(); iterator.hasNext();) {
			FoodItem foodItem = (FoodItem) iterator.next();
			System.out.println("Name:" + foodItem.name() + "Size:" + foodItem.size() + "Price:" + foodItem.price());
		}
	}

}
