package presenter;

import java.io.IOException;
import model.Address;
import model.CustomerManager;
import view.View;

public class Presenter {
	CustomerManager customer;
	View view;

	
	public Presenter() {
		view = new View();
	}
	
	public void Run() {
		view.welcomeMessage();
		
	}
	public void firstDecision() {
		switch (view.firstMenu()) {
		case 1:
			view.secondMenu();
			break;
		case 2:
			view.goodbyeMessage();
		default:
			break;
		}
	}
	public void secondDecision() {
		switch (view.secondMenu()) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
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
		customer.createCustomer(view.askForCustomerName(), new Address(view.askForCustomerCountry(),view.askForCustomerState(),view.askForCustomerCity(),view.askForCustomerNeighbordhood()),view.askForCustomerRut());
		customer.registerCustomer(customer.getCustomer());
	}
	public static void main(String[] args) {
		
	}
	
}
