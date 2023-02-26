package model;

public class Supplier extends Person {
	
	private String webPage;
	private String phone;
	
	public Supplier(String name, Direction direction, String rut, String webPage, String phone) {
		super(name, direction, rut);
		this.webPage = webPage;
		this.phone = phone;
	}
	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
}
