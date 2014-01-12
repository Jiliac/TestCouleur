import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre(Color col) {
		this.setTitle("Ma premi�re fen�tre Java");
		this.setSize(400, 100);
		this.setLocationRelativeTo(null);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		// D�finition de sa couleur de fond
		pan.setBackground(col);
		// On pr�vient notre JFrame que notre JPanel sera son content pane
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	public Fenetre(){
		this(Color.orange);
	}
	
}