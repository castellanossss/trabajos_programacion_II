package presenter;

import model.SuppliersManager;
import model.*;

import java.io.IOException;
import model.Address;
import model.CustomerManager;
import view.View;

public class Presenter {
	CustomerManager customer;
	SuppliersManager supplier;
	ProductsManager product;
	CategoriesManager categories;
	View view;

	
	public Presenter() {
		view = new View();
	}
	public void Run() throws IOException {

		view.welcomeMessage();
		this.firstDecision();
	}
	public void firstDecision() throws IOException {
		switch (view.firstMenu()) {
		case 1:
			this.secondDecision();
			break;
		case 2:
			view.goodbyeMessage();
		default:
			break;
		}
	}
	public void secondDecision() throws IOException {
		switch (view.secondMenu()) {
		case 1:
			this.registerSupplier();
			break;
		case 2:
			registerCustomer();
			break;
		case 3:
			this.registerProduct();
			break;
		case 4:
			break;
		case 5:
			view.goodbyeMessage();
			break;
		default:
		break;
		}
	}
	public void registerCustomer() throws IOException {
		customer = new CustomerManager("Files\\","customers");
		customer.createCustomer(view.askForCustomerRut(), view.askForCustomerName(),new Address(view.askForCustomerCountry(),view.askForCustomerState(),view.askForCustomerCity(),view.askForCustomerNeighbordhood(),view.askForCusAddress()));
		int j = view.askForPhoneNumberAmount();
		for (int i = 1; i <= j; i++) {
			customer.addPhone(view.askForCusPhoneNumber(i));
		}
		customer.registerCustomer(customer.getCustomer());
	}
	public void registerSupplier() throws IOException {
		supplier = new SuppliersManager("Files\\","suppliers");
		supplier.createSupplier(view.askForSupRut(),view.askForSupName(),new Address(view.askForCustomerCountry(),view.askForCustomerState(),view.askForCustomerCity(),view.askForCustomerNeighbordhood(),view.askForCusAddress()) ,view.askForSupWebPage() , view.askForSupPhoneNumber());
	}
	public void registerProduct() throws IOException {
		categories = new CategoriesManager("Files\\","categories");
		product = new ProductsManager("Files\\","products");
		categories.readCategories();
		product.createProduct(12, "brayan", 12, 3, "camilo", categories);
	}
	public static void main(String[] args) throws IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	
}
