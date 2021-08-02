package cogent.go.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "delivery_address_table", schema = "greatoutdoors")
public class DeliveryAddress {
	@Id
	@Column(name = "addressId")
	private int id;
	@Size(max = 60)
	private String addressLine1;
	@Size(max = 60)
	private String addressLine2;
	@Size(max = 30)
	private String state;
	private int pincode;
	
	
}
