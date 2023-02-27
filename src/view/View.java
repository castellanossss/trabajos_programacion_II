package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {
	
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String readData(String message) {
		String data = JOptionPane.showInputDialog(null, message);
		return data;
	}
	
	public void welcomeMessage() {
		showMessage("¡BIENVENIDO AL SISTEMA DE ADMINISTRACION DE ALMACENES DE CADENA!");
	}
	
	public void alertMessage() {
		JOptionPane.showMessageDialog(null, "Por favor, ingresa una opcion valida" , null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void goodbyeMessage() {
		showMessage("¡Programa finalizado, que tengas un excelente dia!");
	}
	
	public int firstMenu() {
		int option = Integer.parseInt(readData("~~~~~~~~~~~~~~~~~~~~~~~~~~\nBienvenido Usuario\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "Que deseas hacer?\n"
				+ "1. Pasar al menu administrativo \n2. Salir \n~~~~~~~~~~~~~~~~~~~~~~~~~~\nDigita una opcion"));
		return option;
	}
	
	public int secondMenu() {
		int option = Integer.parseInt(readData("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nOpciones Disponibles\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "1. Crear Proveedor \n2. Crear Cliente \n3. Crear Producto \n4. Registrar Venta \n5. Ver las Ventas Totales \n6. Salir\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nDigita una opcion"));
		return option;
	}
	
	public String askForRut() {
		String rut = readData("Ingresa el RUT del Proveedor");
		return rut;
	}
	
	public String askForName() {
		String name = readData("Ingresa el Nombre Completo del Proveedor");
		return name;
	}
	
	public void addressInfoMessage() {
		showMessage("A continuacion, ingresaras el pais, estado, ciudad, barrio y direccion del proveedor");
	}
	
	public String askForCountry() {
		String country = readData("Ingresa el Pais donde se ubica el Proveedor");
		return country;
	}
	
	public String askForState() {
		String state = readData("Ingresa el Estado donde se ubica el Proveedor");
		return state;
	}
	
	public String askForCity() {
		String city = readData("Ingresa la Ciudad donde se ubica el Proveedor");
		return city;
	}
	
	public String askForNeighbordhood() {
		String neighbordhood = readData("Ingresa el Barrio donde se ubica el Proveedor");
		return neighbordhood;
	}
	
	public String askForAddress() {
		String address = readData("Ingresa la Direccion donde se ubica el Proveedor");
		return address;
	}
	
	public String askForPhoneNumber() {
		String phoneNumber = readData("Ingresa el Numero Telefonico del Proveedor");
		return phoneNumber;
	}
	
	public String askForWebPage() {
		String webPage = readData("Ingresa la Pagina Web del Proveedor");
		return webPage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
