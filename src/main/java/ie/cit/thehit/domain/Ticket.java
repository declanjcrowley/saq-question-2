package ie.cit.thehit.domain;

public class Ticket {
	
	private int number;
	
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ticket(int number, double price) {
		super();
		this.number = number;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [number=" + number + ", price=" + price + "]";
	}
	
	

}
