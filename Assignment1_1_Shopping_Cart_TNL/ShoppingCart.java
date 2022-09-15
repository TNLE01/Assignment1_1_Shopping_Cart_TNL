
public class ShoppingCart<T>{
	
	private ResizableArrayBag<T> cartBag;
	
	/**
	 * Constructor for Shopping Cart
	 */
	public ShoppingCart() {
		cartBag = new ResizableArrayBag<T>();
	}
	
	/**
	 * Get the total number of Items in the Cart
	 * @return total number of Items in the Cart
	 */
	public int getCurrentSize() {
		return cartBag.getCurrentSize();
	}
	
	/**
	 * Return true or false based on if the Cart is Empty or not
	 * @return true if Cart is Empty and false if otherwise
	 */
	public boolean isEmpty() {
		return cartBag.isEmpty();
	}
	
	/**
	 * Add an Item to the Cart
	 * @param item Item that is going to be added to the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean add(T item) {
		return cartBag.add(item);
	}
	
	/**
	 * Remove an Item from the Cart
	 * @return the removed Item
	 */
	public T remove() {
		return cartBag.remove();
	}
	
	/**
	 * Remove one of a certain Item
	 * @param item Item that is going to be remove from the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean remove(T item) {
		return cartBag.remove(item);
	}
	
	/**
	 * Remove everything in the Cart
	 */
	public void clear() {
		cartBag.clear();
	}
	
	/**
	 * Get the frequency of a certain Item
	 * @param item Item to see the frequency of
	 * @return number of a certain Item
	 */
	public int getFrequencyOf(T item) {
		return cartBag.getFrequencyOf(item);
	}
	
	/**
	 * Checks to see if a certain Item is in the Cart
	 * @param item Item to check to see if its in the Cart
	 * @return True if Item is in Cart, false otherwise
	 */
	public boolean contains(T item) {
		return cartBag.contains(item);
	}
	
	/**
	 * Get all Items in the Cart
	 * @return array if the Items in the Cart
	 */
	public T[] toArray() {
		return cartBag.toArray();
	}
	
	/**
	 * Get total price of everything in the Cart
	 * @return price of everything in the Cart
	 */
	public double totalPrice() {
		Object[] localCart = cartBag.toArray();
		Double sum = 0.0;
		for (Object i: localCart) {
			sum = sum + ((Item) i).getPrice();
		}
		return sum;
	}
	
	/**
	 * Remove all of a certain Item
	 * @param item Item that is going to be remove from the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean removeAll(T item) {
		while (contains(item)) {
			remove(item);
			if (!contains(item)) {
				return !contains(item);
			}
		}
		return contains(item);
	}

}
