package view;

import java.util.Scanner;

public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
    }
    public int readInt(String message) {
        System.out.println(message);
        return console.nextInt();
    }
    public String menu(){
        String str= "a)Crear Proveedor\n"
                +"b)Crear Cliente \n"
                +"c)Crear Producto \n"
                +"D)Registrar Venta\n"
                +"E)Ver Las Ventas Totales\n";
        return str;
    }
    public  void showMessageInt(int x){
        System.out.println(x);
    }
    public void showMessage(String str){
        System.out.println(str);
    }
    public long readLong(String message) {
    	System.out.println(message);
    	return console.nextLong();
    }
}
