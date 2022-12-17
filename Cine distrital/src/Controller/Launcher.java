package Controller;

import View.Menu;
import View.pestanaventa;


//LANZA EL JUEGO 
public class Launcher {

	public static void main(String args[]) {
		// OBJETOS
		pestanaventa frame = new pestanaventa();
		Menu menu = new Menu();
		menu.setVisible(true);
		menu.setLocationRelativeTo(null);

	}
}