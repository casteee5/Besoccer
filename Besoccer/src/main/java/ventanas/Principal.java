package ventanas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ventanas.Ventana;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;

import jfdata.manager.JfdataManager;
import jfdata.model.match.MatchList;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;

public class Principal extends JPanel{
	private Ventana ventana;
	JfdataManager jfdataManager = new JfdataManager("ae87af9163864e60a8b5ac1ed791fca4");
	
	public Principal(Ventana v) {
		super();
		ventana=v;
		setVisible(true);
		setLayout(null);
		setSize(994,600);
		v.setTitle("Partidos");
		v.setContentPane(this);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(10, 38, 179, 434);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		panel_2.setBounds(244, 38, 480, 540);
		add(panel_2);
		
		JScrollPane scroll=new JScrollPane(panel_2);
		add(scroll);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		scroll.setViewportView(panel_2);
		scroll.setBounds(244, 38, 480, 551);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		panel_3.setBounds(750, 38, 234, 419);
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panelJornadas = new JPanel();
		panelJornadas.setBackground(new Color(220, 220, 220));
		panelJornadas.setBounds(32, 11, 192, 396);
		panel_3.add(panelJornadas);
		panelJornadas.setLayout(null);
		
		JTextPane txtpnLaLigaEspaola = new JTextPane();
		txtpnLaLigaEspaola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2014,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnLaLigaEspaola.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnLaLigaEspaola.setBackground(new Color(12,201,10));
			}
		});
		txtpnLaLigaEspaola.setEditable(false);
		txtpnLaLigaEspaola.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnLaLigaEspaola.setBackground(new Color(12,201,10));
		txtpnLaLigaEspaola.setText("La Liga");
		txtpnLaLigaEspaola.setBounds(10, 11, 159, 42);
		panel.add(txtpnLaLigaEspaola);
		
		JTextPane txtpnPremierLeague = new JTextPane();
		txtpnPremierLeague.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2021,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnPremierLeague.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnPremierLeague.setBackground(new Color(12,201,10));
			}
		});
		txtpnPremierLeague.setEditable(false);
		txtpnPremierLeague.setText("Premier League");
		txtpnPremierLeague.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnPremierLeague.setBackground(new Color(12, 201, 10));
		txtpnPremierLeague.setBounds(10, 64, 159, 42);
		panel.add(txtpnPremierLeague);
		
		JTextPane txtpnChampionship = new JTextPane();
		txtpnChampionship.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2016,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnChampionship.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnChampionship.setBackground(new Color(12,201,10));
			}
		});
		txtpnChampionship.setEditable(false);
		txtpnChampionship.setText("Championship");
		txtpnChampionship.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnChampionship.setBackground(new Color(12, 201, 10));
		txtpnChampionship.setBounds(10, 117, 159, 42);
		panel.add(txtpnChampionship);
		
		JTextPane txtpnLigue = new JTextPane();
		txtpnLigue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2015,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnLigue.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnLigue.setBackground(new Color(12,201,10));
			}
		});
		txtpnLigue.setEditable(false);
		txtpnLigue.setText("Ligue 1");
		txtpnLigue.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnLigue.setBackground(new Color(12, 201, 10));
		txtpnLigue.setBounds(10, 170, 159, 42);
		panel.add(txtpnLigue);
		
		JTextPane txtpnBundesliga = new JTextPane();
		txtpnBundesliga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2002,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnBundesliga.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnBundesliga.setBackground(new Color(12,201,10));
			}
		});
		txtpnBundesliga.setEditable(false);
		txtpnBundesliga.setText("Bundesliga");
		txtpnBundesliga.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnBundesliga.setBackground(new Color(12, 201, 10));
		txtpnBundesliga.setBounds(10, 223, 159, 42);
		panel.add(txtpnBundesliga);
		
		JTextPane txtpnSerieA = new JTextPane();
		txtpnSerieA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2019,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnSerieA.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnSerieA.setBackground(new Color(12,201,10));
			}
		});
		txtpnSerieA.setEditable(false);
		txtpnSerieA.setText("Serie A");
		txtpnSerieA.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnSerieA.setBackground(new Color(12, 201, 10));
		txtpnSerieA.setBounds(10, 276, 159, 42);
		panel.add(txtpnSerieA);
		
		JTextPane txtpnEredivise = new JTextPane();
		txtpnEredivise.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2003,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnEredivise.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnEredivise.setBackground(new Color(12,201,10));
			}
		});
		txtpnEredivise.setEditable(false);
		txtpnEredivise.setText("Eredivise");
		txtpnEredivise.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnEredivise.setBackground(new Color(12, 201, 10));
		txtpnEredivise.setBounds(10, 329, 159, 42);
		panel.add(txtpnEredivise);
		
		JTextPane txtpnPrimeiraLiga = new JTextPane();
		txtpnPrimeiraLiga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
				cargaPartidos(2017,jfdataManager,panel_2,"1",panelJornadas);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnPrimeiraLiga.setBackground(new Color(12,231,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnPrimeiraLiga.setBackground(new Color(12,201,10));
			}
		});
		txtpnPrimeiraLiga.setEditable(false);
		txtpnPrimeiraLiga.setText("Liga NOS");
		txtpnPrimeiraLiga.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnPrimeiraLiga.setBackground(new Color(12, 201, 10));
		txtpnPrimeiraLiga.setBounds(10, 382, 159, 42);
		panel.add(txtpnPrimeiraLiga);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setBounds(0, 0, 994, 27);
		add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnIniciarSesin = new JTextPane();
		txtpnIniciarSesin.setEditable(false);
		txtpnIniciarSesin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtpnIniciarSesin.setForeground(new Color(12,201,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnIniciarSesin.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cargaPantallaLogin();
			}
		});
		txtpnIniciarSesin.setBounds(689, 0, 89, 27);
		panel_1.add(txtpnIniciarSesin);
		txtpnIniciarSesin.setBackground(new Color(220, 220, 220));
		txtpnIniciarSesin.setText("Iniciar sesión");
		
		JTextPane txtpnRegistrarse = new JTextPane();
		txtpnRegistrarse.setEditable(false);
		txtpnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtpnRegistrarse.setForeground(new Color(12,201,10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtpnRegistrarse.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cargaPantallaRegistro();
			}
		});
		txtpnRegistrarse.setBackground(new Color(220, 220, 220));
		txtpnRegistrarse.setText("Registrarse");
		txtpnRegistrarse.setBounds(800, 0, 76, 27);
		panel_1.add(txtpnRegistrarse);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(new Color(220, 220, 220));
		textPane.setText("||");
		textPane.setBounds(776, 0, 14, 20);
		panel_1.add(textPane);
		
				JLabel label = new JLabel("");
				label.setBackground(new Color(220, 220, 220));
				label.setIcon(new ImageIcon(".\\fondoproyecto.jpg"));
				label.setBounds(0, 0, 450, 300);
				label.setSize(994,600);
				add(label);
	}
	
	public static void cargaPartidos(int idLiga,JfdataManager jfdataManager,JPanel panel,String jornada,JPanel panelJornadas) {
		int y=5;
		MatchList actual = jfdataManager.getMatchesByCompetition(idLiga);
		panel.removeAll();
		
		for(int i=0;i<actual.getMatches().size();i++) {
			if(actual.getMatches().get(i).getMatchday().equals(jornada)) {	
				CajaPartido JPnlNewJPanel= new CajaPartido(actual.getMatches().get(i).getHomeTeam().getName(),actual.getMatches().get(i).getAwayTeam().getName(),actual.getMatches().get(i).getScore().getFullTime().getHomeTeam(),actual.getMatches().get(i).getScore().getFullTime().getAwayTeam());
				JPnlNewJPanel.setBounds(20, y, 440, 50);
				panel.add(JPnlNewJPanel);
				y+=52;
			}
		}
		
		cargaJornadas(idLiga,jfdataManager,panelJornadas,panel);
		
	}
	
	public static void cargaJornadas(int idLiga,JfdataManager jfdataManager,JPanel panel,JPanel panel_2) {

		int x=0,y=0;
		
		for(int i=1;i<=38;i++) {
			JButton botonJornada=new JButton();
			String jornada=""+i;
			botonJornada.setText(jornada);
			botonJornada.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					cargaPartidos(idLiga,jfdataManager,panel_2,jornada,panel);
				}
			});
			botonJornada.setBounds(x,y,60,30);
			panel.add(botonJornada);
			if(x<80) {
				x+=60;
			}else {
				x=0;
				y+=30;
			}
		}
		
	}
}