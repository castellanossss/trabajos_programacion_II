package model;

import java.io.IOException;

import tools.FileManagerWriter;

public class CustomerManager {
	private Customer customer;
	private FileManagerWriter fm;
	public CustomerManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	public void createCustomer(String name, Address address, String rut) {
		customer = new Customer( name,  address,rut);
	}
	public void registerCustomer(Customer customer) throws IOException {
		fm.toWriter(customer.getName()+ ";" +customer.getRut() + ";" +customer.getDirection().toString());
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void addPhone(String value) {
		
	}
}
