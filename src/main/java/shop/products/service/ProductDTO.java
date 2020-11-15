package shop.products.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class ProductDTO {
	@Id
	String productnumber;
	double price;
	String description;

	public ProductDTO(String productnumber, String description, double price) {
		super();
		this.productnumber = productnumber;
		this.price = price;
		this.description = description;
	}
	
	public ProductDTO() {

	}

	public void print() {
		System.out.println(productnumber+" : "+description+" : "+price);
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

}
