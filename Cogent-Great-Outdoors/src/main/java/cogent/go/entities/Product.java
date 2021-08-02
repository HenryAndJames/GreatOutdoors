package cogent.go.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Product {
	@Id
	private int id;
	@Size(max = 30)
	private String name;
	@Size(max = 200)
	private String description;
	private int price;
	@Size(max = 20)
	private String category;
}
