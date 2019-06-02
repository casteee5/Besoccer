package ventanas;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import java.awt.Color;

public class Ventana extends JFrame{
	
	private PantallaRegistro registro;
	private PantallaLogin login;
	private Principal principal;
	
	public Ventana() {
		super();
		setVisible(true);
	    setSize(1000,629);
	    setResizable(false);
	    
	    principal=new Principal(this);
	    this.setContentPane(principal);
	}
	
	public void cargaPantallaRegistro() {
		if(registro==null) {
			registro=new PantallaRegistro();
		}
	}
	
	public void cargaPantallaLogin() {
		if(login==null) {
			login=new PantallaLogin();
		}
	}
}
