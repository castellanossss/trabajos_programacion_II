package presenter;

import model.SuppliersManager;
import tools.FileManagerReader2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;

import model.Address;
import model.CustomerManager;
import model.SalesManager;
import view.View;

public class Presenter {
	FileManagerReader2 test;
	SuppliersManager supplier;
	CustomerManager customer;
	SalesManager sale;
	View view;

	
	public Presenter() {
		view = new View();
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
			newSupplier();
			break;
		case 2:
			newCustomer();
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
	
	public void newSupplier() throws IOException {
		supplier = new SuppliersManager("Files\\", "suppliers");
		supplier.createSupplier(view.askForSupRut(), view.askForSupName(), 
				new Address(view.askForSupCountry(), view.askForSupState(), view.askForSupCity(), view.askForSupNeighbordhood(), view.askForSupAddress()), 
				view.askForSupPhoneNumber(), view.askForSupWebPage());
	}
	
	public void newCustomer() throws IOException {
		customer = new CustomerManager("Files\\", "customers");
		customer.createCustomer(view.askForCustomerRut(), view.askForCustomerName(),
				new Address(view.askForCustomerCountry(), view.askForCustomerState(), view.askForCustomerCity(), view.askForCustomerNeighbordhood(), view.askForCusAddress()));
		
		int j = view.askForPhoneNumberAmount();
		for (int i = 1; i <= j; i++) {
			customer.addPhone(view.askForCusPhoneNumber(i));
		}
		customer.registerCustomer(customer.getCustomer());
	}
	
	public void Run() throws IOException {
		test();
	}
	
	/*public int generate_random_bill_id() {
		Random random = new Random();
		int random_number = (random.nextInt() * 10000000 + 0);
		return Math.abs(random_number);
	}*/
	
	public LocalDate generate_bill_date() {
		int sale_day = view.askForSaleDay();
		int sale_month = view.askForSaleMonth();
		int sale_year = view.askForSaleYear();
		
		LocalDate date = LocalDate.of(sale_year, sale_month, sale_day);
		return date;
	}
	
	private void newSale() throws IOException {
		int id = view.askForSaleId();
		view.salesDateInfo();
		LocalDate date = generate_bill_date();
		String customerName = view.askForSaleCustomer();
		long disc = view.askForSaleDiscount();
		float fp = view.askForSaleFinalBill();
		
		NumberFormat format = NumberFormat.getCurrencyInstance();
		String discount = format.format(disc);
		String finalPrice = format.format(fp);
		
		sale = new SalesManager("Files\\", "bills");
		sale.createSale(id, date, customerName, discount, finalPrice);
	}
	
	private void test() throws FileNotFoundException, IOException {
		String path = "Files\\bills.txt";
		test = new FileManagerReader2(path);
		String result = test.readFile();
		
		view.showMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n VENTAS REGISTRADAS\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ " La informacion esta organizada de la siguiente forma\n"
				+ " id  ~  Fecha  ~  Nombre del Proveedor  ~  Valor del Descuento  ~  Valor Final\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" 
				+ result);
	}
	
	
	public static void main(String[] args) throws IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	
}
