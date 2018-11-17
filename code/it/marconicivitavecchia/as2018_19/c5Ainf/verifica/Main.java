
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica; 

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// size approssimativa
		super.setSize(500,500);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Menu</h1>");
		// creazione tabella
				sb.append("<div style='display:table'>");
				sb.append("<div style='display:table-row'>");
				sb.append("<div style='display:table-cell'>");
				sb.append("alias");
				sb.append("</div>");
				sb.append("<div style='display:table-cell'>");
				sb.append("Hostname");
				sb.append("</div>");
				sb.append("<div style='display:table-row'>");
				sb.append("<div style='display:table-cell'>");
				sb.append("raspberrry");
				sb.append("</div>");
				sb.append("<div style='display:table-cell'>");
				sb.append("server.marconi.it");
				sb.append("</div>");
				sb.append("</div>");
				sb.append("<div style='display:table-row'>");
				sb.append("<div style='display:table-cell'>");
				sb.append("CoreSwitch");
				sb.append("</div>");
				sb.append("<div style='display:table-cell'>");
				sb.append("10.0.100.1");
				sb.append("</div>");
				sb.append("</div>");
		
				sb.append("</div>");

				sb.append("</html>");

				String str = sb.toString();
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

