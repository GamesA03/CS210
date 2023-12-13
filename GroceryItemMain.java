package week5;

public class GroceryItemMain {
	public static void main (String[] args) {
		GroceryItemOrder2 first = new GroceryItemOrder2("Apple", 3, 2.50);
		GroceryItemOrder2 second = new GroceryItemOrder2("Banana", 4, 3.00);
		GroceryItemOrder2 third = new GroceryItemOrder2("Oranges", 5, 1.50);
		
		GroceryList2 list = new GroceryList2();
		
		
		list.add(first);
		list.add(second);
		list.add(third);
		returnList(list);
	}
		
	
	public static void returnList(GroceryList2 list) {
			System.out.println("Total Cost: " + list.getTotalCost());
			System.out.println();
			list.displayItems();
			
		}
		

	
}
