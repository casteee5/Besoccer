package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

import jfdata.manager.JfdataManager;
import jfdata.model.competition.Competition;
import jfdata.model.competition.CompetitionList;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PantallaRegistro extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	public PantallaRegistro() {
		super();
		setBackground(new Color(192, 192, 192));
		setTitle("Registro");
		setSize(255,212);
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 42, 68, 23);
		getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(137, 43, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 76, 68, 23);
		getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 77, 86, 20);
		getContentPane().add(passwordField);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmarContrasea.setBounds(10, 110, 104, 23);
		getContentPane().add(lblConfirmarContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(137, 111, 86, 20);
		getContentPane().add(passwordField_1);
		
		String opciones[]={"Selccionar opción","Brasil","Inglaterra","Francia","Alemania","Italia","Holanda","Portugal","España","Resto de Europa","Selecciones"};
		List<Competition> sameIdCompetitions=new ArrayList<Competition>();

		String opciones_1[]=new String[sameIdCompetitions.size()];
		
		for(int i=0;i<sameIdCompetitions.size();i++) {
			opciones_1[i]=sameIdCompetitions.get(i).getName();
		}
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(77, 144, 89, 23);
		getContentPane().add(btnRegistrar);
		
		JTextPane txtpnRegistrarUsuario = new JTextPane();
		txtpnRegistrarUsuario.setEditable(false);
		txtpnRegistrarUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		txtpnRegistrarUsuario.setBackground(new Color(12,201,10));
		txtpnRegistrarUsuario.setText("Registrar Usuario");
		txtpnRegistrarUsuario.setBounds(46, 11, 142, 23);
		getContentPane().add(txtpnRegistrarUsuario);
	}
	
public static List<Competition> buscarLigaPorPais(String opcion) {
		
		JfdataManager jfdataManager = new JfdataManager("ae87af9163864e60a8b5ac1ed791fca4");
		CompetitionList actual = jfdataManager.getAllCompetitions();
		int i;
		List<Competition> sameIdCompetitions=new ArrayList<Competition>();
		
		switch(opcion) {
			case "Brasil":
				opcion="Brazil";
			break;
			
			case "Inglaterra":
				opcion="England";
			break;
			
			case "Francia":
				opcion="France";
			break;
			
			case "Alemania":
				opcion="Germany";
			break;
			
			case "Italia":
				opcion="Italy";
			break;
			
			case "Holanda":
				opcion="Netherlands";
			break;
			
			case "Portugal":
				opcion="Portugal";
			break;
			
			case "España":
				opcion="Spain";
			break;
			
			case "Resto de Europa":
				opcion="Europe";
			break;
			
			case "Selecciones":
				opcion="World";
			break;
		}
		
		for(i=0;i<actual.getCompetitions().size();i++) {	
			if(opcion.equals(actual.getCompetitions().get(i).getArea().getName())) {
				sameIdCompetitions.add(actual.getCompetitions().get(i));
			}
			
		}
		
		System.out.println(sameIdCompetitions);
		return sameIdCompetitions;
	}
	public void  Connection(){
		 
			/*Connection bd=null;
	               try {
		             bd=DriverManager.getConnection(
		                   "jdbc:mysql://localhost:3306/portal?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
		                    ,"","");
		        } catch (SQLException ex) {
		                    System.err.println("La conexion  a bd ha fallado");
		        }*/
	               
	}
}
