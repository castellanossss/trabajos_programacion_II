package model;

import java.io.IOException;

import tools.FileManagerWriter;

public class CustomerManager {
	private Customer customer;
	private FileManagerWriter fm;
	public CustomerManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	public void createCustomer(String name, Address address, String rut,int j) {
		customer = new Customer( name,  address,rut);
	}
	public void registerEmployee(Customer customer) throws IOException {
		fm.toWriter(customer.getName()+ ";" +customer.getRut() + ";" +customer.getDirection().toString());
	}
	public void addPhone(String value) {
		
	}
}
