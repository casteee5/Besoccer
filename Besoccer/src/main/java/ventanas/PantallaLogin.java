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

public class PantallaLogin extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	
	public PantallaLogin() {
		super();
		setBackground(new Color(192, 192, 192));
		setTitle("Login");
		setSize(255,190);
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
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(80, 118, 89, 23);
		getContentPane().add(btnLogin);
		
		JTextPane txtpnLoginUsuario = new JTextPane();
		txtpnLoginUsuario.setEditable(false);
		txtpnLoginUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		txtpnLoginUsuario.setBackground(new Color(12,201,10));
		txtpnLoginUsuario.setText("Login");
		txtpnLoginUsuario.setBounds(96, 11, 49, 23);
		getContentPane().add(txtpnLoginUsuario);
	}
	
}

