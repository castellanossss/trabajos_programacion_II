package model;

import java.io.IOException;
import tools.FileManagerWriter;

public class SuppliersManager {
	private Supplier supplier;
	private FileManagerWriter fm;

	public SuppliersManager(String path, String name) throws IOException {
		fm = new FileManagerWriter(path, name);
	}
	
	public void registerEmployee(Supplier supplier) throws IOException {
		fm.toWriter(supplier.getName()+ ";" + supplier.getRut() + ";" + supplier.getWebPage());
	}
	
	public void createSupplier(String name, Address address, String rut, String webPage, String phone) throws IOException {
		 supplier = new Supplier(name, address, rut, webPage, phone);
		 this.registerEmployee(supplier);
	}
	
}
