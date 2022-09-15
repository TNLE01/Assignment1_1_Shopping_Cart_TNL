import java.text.NumberFormat;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		Item toy = new Item("Toy", 3.00); Item food = new Item("Food", 5.00); Item soda = new Item("Soda", 2.00); Item book = new Item("Book", 4.00);
		ShoppingCart<Item> cart = new ShoppingCart<Item>();
		
		
		
		System.out.print("Adding Toy to Cart: " + cart.add(toy)); System.out.print(". Adding Food to Cart: " + cart.add(food)); System.out.print(". Adding Soda to Cart: " + cart.add(soda)); System.out.println(". Adding Book to Cart: " + cart.add(book));
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		System.out.println("Is Empty?: " + cart.isEmpty());
		System.out.println("Current Cart Size: " + cart.getCurrentSize());
		System.out.println("Get Frequency Of Toy: " + cart.getFrequencyOf(toy));
		System.out.println("Contains Book: " + cart.contains(book));
		System.out.println("Removing Item from the end: " + cart.remove());
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		System.out.println("Removing Toy from the cart: " + cart.remove(toy));
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		System.out.println("Get Total Price: " + NumberFormat.getCurrencyInstance().format(cart.totalPrice()));
		cart.clear();
		System.out.println("Clearing Cart: " + Arrays.toString(cart.toArray()));
		
		cart.add(toy); cart.add(toy); cart.add(toy); cart.add(toy); cart.add(toy); cart.add(book);
		System.out.println("Cart after adding a few Items: " + Arrays.toString(cart.toArray()));
		System.out.println("Remove all Toys from cart: " + cart.removeAll(toy));
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		cart.clear();
		
		System.out.println("\nAfter Testing: ");
		Item pencil = new Item("Pencil", 1.00);
		System.out.println("Adding Toy, Book, Toy, Food, Food, Soda, Pencil, and Book"); cart.add(toy); cart.add(book); cart.add(toy); cart.add(food); cart.add(food); cart.add(soda); cart.add(pencil); cart.add(book);
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		System.out.println("Get Total Price: " + NumberFormat.getCurrencyInstance().format(cart.totalPrice()));
		System.out.println("Removing Toy, Toy, Food, Soda, and Book"); cart.remove(toy); cart.remove(toy); cart.remove(food); cart.remove(soda); cart.remove(book);
		System.out.println("To Array: " + Arrays.toString(cart.toArray()));
		System.out.println("Get Total Price: " + NumberFormat.getCurrencyInstance().format(cart.totalPrice()));

	}

}
