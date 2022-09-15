import java.text.NumberFormat;

public class Item {
	
	private String name;
	private Double price;
	
	/**
	 * Constructor for Item
	 */
	public Item() {name = null; price = null;}
	public Item(String name, Double price) {this.name = name; this.price = price;}
	
	/**
	 * Set the name for Item
	 * @param name new name for Item
	 */
	public void setName(String name) {this.name = name;}
	
	/**
	 * Set the price for Item
	 * @param price new price for Item
	 */
	public void setPrice(Double price) {this.price = price;}
	
	/**
	 * Getter for name and price of Item
	 */
	public String getName() {return name;}
	public Double getPrice() {return price;}
	
	/**
	 * To String method
	 */
	public String toString() {
		String result = "";
		result = result + this.name + ": " + NumberFormat.getCurrencyInstance().format(price);
		return result;
	}
}
