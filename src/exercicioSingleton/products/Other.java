package exercicioSingleton.products;

public class Other {
	
	private String name;
	private String product;
	
	public Other(String name, String product) {
		this.name = name;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Other [name=" + name + ", product=" + product + "]";
	}
	
	

}
