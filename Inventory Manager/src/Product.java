
public class Product {
	private int id;
	private String name;
	private String description;
	private String model;
	private double price;
	private int minStockLevel;
	private int minOrder;
	private int stockQuantity;
	
	//Constructor to take parameters
	public Product(int id, String name, String description, String model,double price, int minStockLevel, int minOrder, int stockQuantity) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.model = model;
		this.price = price;
		this.minStockLevel= minStockLevel;
		this.minOrder = minOrder;
		this.stockQuantity = stockQuantity;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public String setDescription(String description) {
		return this.description = description;
	}
	public String getModel() {
		return model;
	}
	public String setModel(String model) {
		return this.model = model;
	}
	
	double getPrice() {
	        return price;
	}
	public void setPrice(double price) {
	        this.price = price;
	}
	public int getStockQuantity() {
        return stockQuantity;
    }
	public void setStockQuanity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public int getMinStockLevel() {
        return minStockLevel;
    }

    public void setMinStockLevel(int minStockLevel) {
        this.minStockLevel = minStockLevel;
    }
    public int getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(int minOrder) {
        this.minOrder = minOrder;
    }
    
    
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


