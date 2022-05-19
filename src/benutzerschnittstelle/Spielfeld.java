package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachkonzept.Platte;
import fachkonzept.Spiel;

/**
 * GUI Klasse des Programms Gehweg-Parcours
 * 
 * @author julianschumacher
 *
 */
public final class Spielfeld extends JFrame
{

	/**
	 * Die SerialVersionUID Dies steht für "unique identification"
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Das Hauptpanel in dem Fenster
	 */
	private JPanel panel = new JPanel(new GridLayout(14, 6));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Spielfeld fenster = new Spielfeld();
					fenster.setVisible(true);
				}
				catch (Exception fehler)
				{
					fehler.printStackTrace();
				}
			}
		});
	}

	/**
	 * Panel erstellen.
	 */
	public Spielfeld()
	{
		// Initialisieren
		initialisieren();

		// Objekte zu dem Fenster hinzuzufügen
		objekteHinzufügen();

	}

	/**
	 * Initialisiert alle Werte ebenso wie z.B. den Titel des Fensters
	 */
	private void initialisieren()
	{
		final JPanel contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 600);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(320, 560));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setMinimumSize(new Dimension(getBounds().width, getBounds().height));

		// Titel des Fensters festlegen
		setTitle("Gehweg-Parcours");

		// Möglichkeit das Fenster zu skalieren aktivieren
		setResizable(true);

		// Das Fenster selbst aktivieren
		setEnabled(true);

		// Die Sprache auf Deutsch setzen
		setLocale(new Locale("de"));
	}

	/**
	 * Fügt alle Objekte, wie z.B. Platten (als Buttons) zum Fenster hnzu.
	 */
	private void objekteHinzufügen()
	{
		// erstelle Spiel
		final Spiel spiel = new Spiel();

		// For-Schleife für die Spalten
		for (int zählerSpalte = 0; zählerSpalte < spiel
				.leseSpalten(); zählerSpalte++)
		{
			// For-Schleife für die Zeilen in einer Spalte
			for (int zählerZeile = 0; zählerZeile < spiel
					.leseZeilen(); zählerZeile++)
			{
				// Icon für die zugedeckten Platten
				final ImageIcon icon = new ImageIcon(
						"../../assets/zugedeckt.png");
				// Knopf erstellen
				final JButton button = new JButton();
				button.setPreferredSize(new Dimension(20, 20));
				// Platte an der aktuellen Position bekommen
				final Platte platte = spiel.lesePlatte(zählerSpalte,
						zählerZeile);
				// Icon festlegen
				button.setIcon(icon);
				// MouseListener hinzufügen
				button.addMouseListener(new MouseListener()
				{
					// Diese Methoden sind irrelevant für dieses Programm.
					// Somit sind sie nicht beschrieben und können ignoriert
					// werden

					@Override
					public void mouseReleased(MouseEvent e)
					{
					}

					@Override
					public void mousePressed(MouseEvent e)
					{
					}

					@Override
					public void mouseExited(MouseEvent e)
					{
					}

					@Override
					public void mouseEntered(MouseEvent e)
					{
					}

					@Override
					public void mouseClicked(MouseEvent mausKlick)
					{
						// Linksklick
						if (mausKlick.getButton() == MouseEvent.BUTTON1)
						{
							if (platte.istHundehaufenAufPlatte())
							{
								button.setIcon(new ImageIcon(
										"../../assets/Kacke.png"));
								// Spiel ist verloren
							}
							else
							{
								// Angrenzende Hundehaufen anzeigen
								final int angrenzendeHundehaufen = platte
										.leseAngrenzendeHundehaufen();
								button.setText(Integer
										.toString(angrenzendeHundehaufen));
							}
						}
						else
						{
							// Rechtsklick
							if (mausKlick.getButton() == MouseEvent.BUTTON3)
							{
								// Vermutung durch Fahne anzeigen
								button.setIcon(new ImageIcon(
										"../../assets/Fahne.png"));
							}
							else
							{
								// Weder Links- noch Rechtsklick. Insofern ist
								// es für dieses Programm irrelevant
							}
						}

					}
				});
				panel.add(button);
			}
		}
	}
}
