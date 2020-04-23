
public class Application {

	public static void main(String[] args) {
	
		// Проверка на цену
		Product p1 = new Product("iPhone", -10000.00, 1);
		
		// Проверка на имя
		Product p2 = new Product(" ", 30000.00, 2);
		
		// Проверка на количество
		Product p3 = new Product("Samsung", 1000.00, -4);
		
	}

}

class  Product{
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.trim().length() != 0)
			this.name = name;
		else
			System.err.println("Name can't be empty!");
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		if(quantity > 0)
			this.quantity = quantity;
		else
			System.err.println("Wrong value of quantity!");
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if(price >= 1 && price <=100000000)
			this.price = price;
		else
			System.err.println("Wrong value of price!");
	}
	
	
}