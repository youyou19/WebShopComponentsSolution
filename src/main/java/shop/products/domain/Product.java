package shop.products.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Product {
	@Id
	String productnumber;
	double price;
	String description;
	Stock stock;

	public Product(String productnumber, String description, double price) {
		super();
		this.productnumber = productnumber;
		this.price = price;
		this.description = description;
	}
	
	public Product() {

	}

	public void print() {
		System.out.println(productnumber+" : "+description+" : "+price);
		if(stock != null) {
			stock.print();
		}
	}
	public String getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	

}
