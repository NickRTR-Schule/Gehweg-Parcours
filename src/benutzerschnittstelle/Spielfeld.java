package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	 * Die SerialVersionUID Dies steht fuer "unique identification"
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

		// Objekte zu dem Fenster hinzuzufuegen
		objekteHinzufuegen();

	}

	/**
	 * Initialisiert alle Werte ebenso wie z.B. den Titel des Fensters
	 */
	private void initialisieren()
	{
		// Panel erstellen
		final JPanel contentPane = new JPanel();

		// Standard Operation beim schließen festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Ränder festlegen
		setBounds(100, 100, 350, 600);

		// Border Layout hinzufügen
		contentPane.add(panel, BorderLayout.NORTH);

		// Standard Größe festlegen
		panel.setPreferredSize(new Dimension(320, 560));

		// Border / Rand festlegen
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Inhalts panel festlegen
		setContentPane(contentPane);

		// Minimale Größe setzen
		// Das Fenster kann nicht kleiner als diese Größe sein.
		setMinimumSize(new Dimension(getBounds().width, getBounds().height));

		// Titel des Fensters festlegen
		setTitle("Gehweg-Parcours");

		// Moeglichkeit das Fenster zu skalieren aktivieren
		setResizable(true);

		// Das Fenster selbst aktivieren
		setEnabled(true);

		// Die Sprache auf Deutsch setzen
		setLocale(new Locale("de"));
	}

	/**
	 * Fuegt alle Objekte, wie z.B. Platten (als Buttons) zum Fenster hnzu.
	 */
	private void objekteHinzufuegen()
	{
		// erstelle Spiel
		final Spiel spiel = new Spiel();

		// Kacke Icon laden
		final InputStream kackeAlsStream = Spielfeld.class.getClassLoader()
				.getResourceAsStream("Kacke.png");
		final ImageIcon kackeImg;

		try
		{
			kackeImg = new ImageIcon(kackeAlsStream.readAllBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return;
		}

		final InputStream fahneAlsStream = Spielfeld.class.getClassLoader()
				.getResourceAsStream("Fahne.png");
		final ImageIcon fahneIcon;
		try
		{
			fahneIcon = new ImageIcon(fahneAlsStream.readAllBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return;
		}

		// Icon fuer die zugedeckten Platten
		final InputStream zugedecktAlsStream = Spielfeld.class.getClassLoader()
				.getResourceAsStream("zugedeckt.png");
		final ImageIcon zugedecktIcon;
		try
		{
			zugedecktIcon = new ImageIcon(zugedecktAlsStream.readAllBytes());
			Image image = zugedecktIcon.getImage();
			Image scaledInstance = image.getScaledInstance(20, 20,
					Image.SCALE_DEFAULT);
			zugedecktIcon.setImage(scaledInstance);
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
			return;
		}

		// For-Schleife fuer die Spalten
		for (int zaehlerSpalte = 0; zaehlerSpalte < spiel
				.leseSpalten(); zaehlerSpalte++)
		{
			// For-Schleife fuer die Zeilen in einer Spalte
			for (int zaehlerZeile = 0; zaehlerZeile < spiel
					.leseZeilen(); zaehlerZeile++)
			{

				// Knopf erstellen
				final JButton button = new JButton();
				button.setPreferredSize(new Dimension(20, 20));
				// Platte an der aktuellen Position bekommen
				final Platte platte = spiel.lesePlatte(zaehlerSpalte,
						zaehlerZeile);
				// Icon festlegen
				button.setIcon(zugedecktIcon);
				// MouseListener hinzufuegen
				button.addMouseListener(new MouseListener()
				{
					// Diese Methoden sind irrelevant fuer dieses Programm.
					// Somit sind sie nicht beschrieben und koennen ignoriert
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
								button.setIcon(kackeImg);
								JOptionPane.showMessageDialog(null,
										spiel.verloren());
							}
							else
							{
								// Angrenzende Hundehaufen anzeigen
								final int angrenzendeHundehaufen = spiel
										.leseAngrenzendeHundehaufen(
												platte.leseSpalte(),
												platte.leseZeile());
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
								button.setIcon(fahneIcon);
							}
							else
							{
								// Weder Links- noch Rechtsklick. Insofern ist
								// es fuer dieses Programm irrelevant
							}
						}

					}
				});
				panel.add(button);
			}
		}
	}
}
