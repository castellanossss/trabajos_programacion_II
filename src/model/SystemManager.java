package model;

public class SystemManager {
	CategoriesManager categories;
	CustomerManager customer;
	SuppliersManager supplier;
	ProductsManager product;
	SalesManager sales;
	public CategoriesManager getCategories() {
		return categories;
	}
	public void setCategories(CategoriesManager categories) {
		this.categories = categories;
	}
	public CustomerManager getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerManager customer) {
		this.customer = customer;
	}
	public SuppliersManager getSupplier() {
		return supplier;
	}
	public void setSupplier(SuppliersManager supplier) {
		this.supplier = supplier;
	}
	public ProductsManager getProduct() {
		return product;
	}
	public void setProduct(ProductsManager product) {
		this.product = product;
	}
	public SalesManager getSales() {
		return sales;
	}
	public void setSales(SalesManager sales) {
		this.sales = sales;
	}
}
