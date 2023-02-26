package model;

import java.io.IOException;
import java.util.ArrayList;

import tools.FileManagerWriter;

public class ManagerSupplier {
	Supplier supplier;
	FileManagerWriter fm;
	//ArrayList<Supplier>supplier;
	public ManagerSupplier(String path,String name) throws IOException {
		fm = new FileManagerWriter(path,name);
		//supplier = new ArrayList();
	}
	public void registerEmployee(Supplier supplier) throws IOException {
		fm.toWriter(supplier.getName()+";"+supplier.getRut()+";"+supplier.getWebPage());
	}
	public void create(String name, Direction direction, String rut, String webPage, String phone) throws IOException {
		 supplier = new Supplier(name, direction,rut, webPage, phone);
		 this.registerEmployee(supplier);
		 
	}
	public static void main(String[] args) throws IOException {
		String path ="Files\\";
		String name ="Suppler";
		ManagerSupplier ms = new ManagerSupplier(path,name);
		ms.create("brayan", new Direction(),"adasd", "adadasd", "asdadasd");
	}
}
