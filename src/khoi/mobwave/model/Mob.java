package khoi.mobwave.model;

public class Mob {

	private String Name;
	private int Quantity;
	
	public Mob(String name, int quantity) {
		super();
		this.setName(name);
		this.setQuantity(quantity);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
