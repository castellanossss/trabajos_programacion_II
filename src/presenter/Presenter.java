package presenter;

<<<<<<< HEAD
=======
import model.SuppliersManager;

>>>>>>> b9eff5c2fb5fa50351789a4304fbcf71f22beb88
import java.io.IOException;
import model.Address;
import model.CustomerManager;
import view.View;

public class Presenter {
	CustomerManager customer;
	View view;
<<<<<<< HEAD

=======
>>>>>>> b9eff5c2fb5fa50351789a4304fbcf71f22beb88
	
	public Presenter() {
		view = new View();
	}
<<<<<<< HEAD
	
	public void Run() {
=======
	public void Run() throws IOException {
>>>>>>> b9eff5c2fb5fa50351789a4304fbcf71f22beb88
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
			
			break;
		case 2:
			registerCustomer();
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
		customer.createCustomer(view.askForCustomerRut(), view.askForCustomerName(),new Address(view.askForCustomerCountry(),view.askForCustomerState(),view.askForCustomerCity(),view.askForCustomerNeighbordhood(),view.askForCusAddress()));
		int j = view.askForPhoneNumberAmount();
		for (int i = 1; i <= j; i++) {
			customer.addPhone(view.askForCusPhoneNumber(i));
		}
		customer.registerCustomer(customer.getCustomer());
	}
	public static void main(String[] args) throws IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	
}
