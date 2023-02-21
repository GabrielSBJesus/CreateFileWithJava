package product;

public class Product {
	private String name;
	private Double value;
	private Integer quant;
	
	public Product(String name, Double value, Integer quant) {
		super();
		this.name = name;
		this.value = value;
		this.quant = quant;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public Double total(Double value1, Integer value2) {
		return value1 * value2;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + ", quant=" + quant + "]";
	}
	
	
	
	
}
