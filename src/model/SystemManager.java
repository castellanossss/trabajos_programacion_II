package model;

<<<<<<< HEAD
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
=======
import java.io.IOException;

public class SystemManager {
	SuppliersManager supplier;
	SalesManager sale;
	ProductsManager product;
	CustomerManager customer;
	CategoriesManager categories;
	public void createCustomerManager(String path, String name) throws IOException {
		customer = new CustomerManager(path,name);
>>>>>>> master
	}
	public SuppliersManager getSupplier() {
		return supplier;
	}
	public void setSupplier(SuppliersManager supplier) {
		this.supplier = supplier;
	}
<<<<<<< HEAD
=======
	public SalesManager getSale() {
		return sale;
	}
	public void setSale(SalesManager sale) {
		this.sale = sale;
	}
>>>>>>> master
	public ProductsManager getProduct() {
		return product;
	}
	public void setProduct(ProductsManager product) {
		this.product = product;
	}
<<<<<<< HEAD
	public SalesManager getSales() {
		return sales;
	}
	public void setSales(SalesManager sales) {
		this.sales = sales;
=======
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
>>>>>>> master
	}
}
