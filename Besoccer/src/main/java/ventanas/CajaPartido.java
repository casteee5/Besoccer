package ventanas;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class CajaPartido extends JPanel{
	public CajaPartido(String equipoLocal,String equipoVisitante,String resultLocal,String resultVisitante) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		setLayout(null);
		setBackground(new Color(220, 220, 220));
		
		JTextPane textPaneLocal = new JTextPane();
		textPaneLocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPaneLocal.setEditable(false);
		textPaneLocal.setBackground(new Color(220, 220, 220));
		textPaneLocal.setBounds(10, 11, 152, 28);
		textPaneLocal.setText(equipoLocal);
		add(textPaneLocal);
		
		JTextPane textPaneVisitante = new JTextPane();
		textPaneVisitante.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPaneVisitante.setEditable(false);
		textPaneVisitante.setBackground(new Color(220, 220, 220));
		textPaneVisitante.setBounds(278, 11, 152, 28);
		textPaneVisitante.setText(equipoVisitante);
		add(textPaneVisitante);
		
		JTextPane textPaneBarra = new JTextPane();
		textPaneBarra.setEditable(false);
		textPaneBarra.setBackground(new Color(220, 220, 220));
		textPaneBarra.setText("-");
		textPaneBarra.setBounds(205, 11, 10, 20);
		add(textPaneBarra);
		
		JTextPane textPaneResultLocal = new JTextPane();
		textPaneResultLocal.setEditable(false);
		textPaneResultLocal.setBackground(new Color(220, 220, 220));
		textPaneResultLocal.setBounds(175, 11, 35, 20);
		textPaneResultLocal.setText(resultLocal);
		add(textPaneResultLocal);
		
		JTextPane textPaneResultVisitante = new JTextPane();
		textPaneResultVisitante.setEditable(false);
		textPaneResultVisitante.setBackground(new Color(220, 220, 220));
		textPaneResultVisitante.setBounds(233, 11, 35, 20);
		textPaneResultVisitante.setText(resultVisitante);
		add(textPaneResultVisitante);
	}

}
