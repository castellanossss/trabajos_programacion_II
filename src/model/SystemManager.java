package model;

import java.io.IOException;

public class SystemManager {
	SuppliersManager supplier;
	SalesManager sale;
	ProductsManager product;
	CustomerManager customer;
	CategoriesManager categories;
	public void createCustomerManager(String path, String name) throws IOException {
		customer = new CustomerManager(path,name);
	}
	public SuppliersManager getSupplier() {
		return supplier;
	}
	public void setSupplier(SuppliersManager supplier) {
		this.supplier = supplier;
	}
	public SalesManager getSale() {
		return sale;
	}
	public void setSale(SalesManager sale) {
		this.sale = sale;
	}
	public ProductsManager getProduct() {
		return product;
	}
	public void setProduct(ProductsManager product) {
		this.product = product;
	}
	public CustomerManager getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerManager customer) {
		this.customer = customer;
	}
	public CategoriesManager getCategories() {
		return categories;
	}
	public void setCategories(CategoriesManager categories) {
		this.categories = categories;
	}
}
