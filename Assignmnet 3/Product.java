package day3;

public class Product {
	String productCode;
	String productName ;
	double productPrice ;
	char categoryCode ;
	private static int prodCounter=100;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	public static int getProdCounter() {
		return prodCounter;
	}
	public static void setProdCounter(int prodCounter) {
		Product.prodCounter = prodCounter;
	}
	private String generateProductCode()
	{
		prodCounter+=1;
		this.productCode=categoryCode+Integer.toString(prodCounter);
		return productCode;
	}
	public Product(String productName, double productPrice, char categoryCode)
	{
		super();
		this.categoryCode=categoryCode;
		this.productName=productName;
		this.productPrice=productPrice;
		productCode=generateProductCode();

	}
	public Product(String productName, double productPrice)
	{
		this.productCode=generateProductCode();
		this.categoryCode='E';
	}
	public String getProductDetails()
	{
		String str="Product Code :"+productCode + 
				"\nName :"+productName+",\n" + 
				"price : " +productPrice+",\n" + 
				"Category : "+categoryCode;
		return str;
}
}
