package core.java.designPattern.builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		
		OrderedItems itemsOrdered = new OrderedItems();
		
		// Enter your order 
		
		/** Order Summary:
		 * 2 Chicken Pizza
		 * 1 Fish Pizza
		 * 1 tomato Onion Pepper Pizza
		 * 1 FarmDelight Pizza
		 * 4 Coke
		 * 3 ThumbsUp
		 * */
		
		// 2 chicken pizza
		itemsOrdered.addItems(new ChickenDelight());
		itemsOrdered.addItems(new ChickenDelight());

		// 1 fish pizza
		itemsOrdered.addItems(new FishPizza());
		
		// 1 tomato onion pepper pizza
		itemsOrdered.addItems(new TomatoOnionPepperPizza());
		
		// 1 farmdelight pizza
		itemsOrdered.addItems(new FarmDelightPizza());
		
		// 4 coke
		itemsOrdered.addItems(new Coke());
		itemsOrdered.addItems(new Coke());
		itemsOrdered.addItems(new Coke());
		itemsOrdered.addItems(new Coke());
		
		//3 ThumbsUp
		itemsOrdered.addItems(new ThumbsUp());
		itemsOrdered.addItems(new ThumbsUp());
		itemsOrdered.addItems(new ThumbsUp());
		
		// Show Items Ordered and cost as well
		itemsOrdered.showItems();
		
		System.out.println("Total Cost of Items is : " + itemsOrdered.getCost());
		
	}

}
