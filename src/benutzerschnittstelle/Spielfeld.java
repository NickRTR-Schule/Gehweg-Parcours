package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	private static final long serialVersionUID = 1709700203173877403L;

	/**
	 * Das Hauptpanel in dem Fenster
	 */
	private final JPanel panel = new JPanel(new GridLayout(14, 6));
	static private Spielfeld fenster = new Spielfeld();

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
				fenster.setVisible(true);
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
		setMinimumSize(
				new Dimension(getBounds().width, getBounds().height + 25));

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

		// Menue bar hinzufügen
		final JMenuBar menuBar = new JMenuBar();
		final JMenu menu = new JMenu("Optionen");
		final JMenuItem neustartItem = new JMenuItem(
				new AbstractAction("Spiel neustarten")
				{

					private static final long serialVersionUID = 881040705104374571L;

					@Override
					public void actionPerformed(ActionEvent e)
					{
						final int optiongewaehlt = JOptionPane
								.showConfirmDialog(null,
										"M�chten Sie das Spiel wirklich neustarten?");
						if (optiongewaehlt == JOptionPane.YES_OPTION)
						{
							if (fenster != null)
							{
								fenster.setVisible(false);
								fenster.dispose();
							}
							fenster = new Spielfeld();
							fenster.setVisible(true);
						}
					}
				});
		menu.add(neustartItem);
		menuBar.add(menu);
		setJMenuBar(menuBar);

		// erstelle Spiel
		final Spiel spiel = new Spiel();

		// Kacke Icon laden
		final InputStream kackeAlsStream = Spielfeld.class.getClassLoader()
				.getResourceAsStream("Kacke.png");
		final ImageIcon kackeIcon;

		try
		{
			kackeIcon = new ImageIcon(kackeAlsStream.readAllBytes());
			final Image image = kackeIcon.getImage();
			final Image scaledInstance = image.getScaledInstance(20, 20,
					Image.SCALE_DEFAULT);
			kackeIcon.setImage(scaledInstance);
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
			final Image image = fahneIcon.getImage();
			final Image scaledInstance = image.getScaledInstance(20, 20,
					Image.SCALE_DEFAULT);
			fahneIcon.setImage(scaledInstance);
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
			final Image image = zugedecktIcon.getImage();
			final Image scaledInstance = image.getScaledInstance(20, 20,
					Image.SCALE_DEFAULT);
			zugedecktIcon.setImage(scaledInstance);
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
			return;
		}

		// For-Schleife fuer die Zeilen
		for (int zaehlerZeile = 0; zaehlerZeile < spiel
				.leseZeilen(); zaehlerZeile++)
		{
			// For-Schleife fuer die Spalten in einer Zeile
			for (int zaehlerSpalte = 0; zaehlerSpalte < spiel
					.leseSpalten(); zaehlerSpalte++)
			{

				// Platte an der aktuellen Position bekommen
				final Platte platte = spiel.lesePlatte(zaehlerSpalte,
						zaehlerZeile);

				// Knopf erstellen
				final JButton button = platte.leseButton();
				button.setPreferredSize(new Dimension(20, 20));

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
						if (platte.leseVermutung()
								&& !platte.leseIstAufgedeckt())
						{
							if (mausKlick.getButton() == MouseEvent.BUTTON3)
							{
								button.setIcon(zugedecktIcon);
								spiel.entferneVermutung();
								platte.entferneVermutung();
							}
						}
						else
						{
							// Linksklick
							if (mausKlick.getButton() == MouseEvent.BUTTON1)
							{
								platte.setzteIstAufgedeckt();
								if (platte.istHundehaufenAufPlatte())
								{
									button.setIcon(kackeIcon);
									JOptionPane.showMessageDialog(null,
											spiel.verloren());
									allePlattenAufdecken(spiel, kackeIcon);
									// BUG: Spiel wird nicht beendet, sonst
									// werden Platten nicht aufgedeckt
									// BUG: Vielleicht wäre dafür ein Timer gut?
									// Oder der Benutzer muss selbst beenden
									// System.exit(0);
								}
								else
								{
									// Angrenzende Hundehaufen anzeigen
									/*
									 * Icon "entfernen", damit genug Platz fuer
									 * die Zahl vorhanden ist
									 */
									button.setIcon(null);
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
									if (spiel.leseVermutungen() < spiel
											.leseMaximaleHundehaufen()
											&& !platte.leseIstAufgedeckt())
									{
										// Vermutung durch Fahne anzeigen
										button.setIcon(fahneIcon);
										spiel.fuegeVermutungHinzu();
										platte.setzeVermutung();
									}

								}
								else
								{
									// Weder Links- noch Rechtsklick. Insofern
									// ist
									// es fuer dieses Programm irrelevant
								}
							}

						}
					}
				});
				panel.add(button);
			}
		}
	}

	public boolean tstGewonnen(Spiel spiel)
	{
		if (spiel.hatGewonnen())
		{
			JOptionPane.showConfirmDialog(null,
					"Herzlichen Glueckwunsch! \n Moechten Sie nochmal spielen?");
			return true;
		}
		else
		{
			return false;
		}
	}

	public void allePlattenAufdecken(Spiel spiel, ImageIcon kackeIcon)
	{
		for (int zaehlerZeile = 0; zaehlerZeile < spiel
				.leseZeilen(); zaehlerZeile++)
		{
			// For-Schleife fuer die Spalten in einer Zeile
			for (int zaehlerSpalte = 0; zaehlerSpalte < spiel
					.leseSpalten(); zaehlerSpalte++)
			{
				// Platten aufdecken (Kacke wenn Kacke und lehre Platte wenn
				// keine Kacke auf Platte)
				if (spiel.lesePlatte(zaehlerSpalte, zaehlerZeile)
						.istHundehaufenAufPlatte())
				{
					spiel.lesePlatte(zaehlerSpalte, zaehlerZeile).leseButton()
							.setIcon(kackeIcon);
				}
				else
				{
					spiel.lesePlatte(zaehlerSpalte, zaehlerZeile).leseButton()
							.setIcon(null);
				}
			}
		}
	}
}
