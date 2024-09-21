package in.ashokit.binding;

public class Product {
	
	private Integer id;
	private String name;
	private Double prise;
	
	public Product() {
		
	}
	public Product(Integer id, String name, Double prise) {
		super();
		this.id = id;
		this.name = name;
		this.prise = prise;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrise() {
		return prise;
	}
	public void setPrise(Double prise) {
		this.prise = prise;
	}
	
	

}
