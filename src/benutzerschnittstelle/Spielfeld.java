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
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
	private final JPanel panel;
	static private Spielfeld fenster = new Spielfeld();
	private int anzahlHundehaufen;
	private int spalten;
	private int zeilen;

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
		// Spalten und Zeilen festlegen
		final JPanel inputPanel = new JPanel();
		final JTextField spaltenFeld = new JTextField("4");
		final JTextField zeilenFeld = new JTextField("16");
		inputPanel.setLayout(new GridLayout(4, 1));
		inputPanel.add(new JLabel("Spalten:"));
		inputPanel.add(spaltenFeld);
		inputPanel.add(new JLabel("Zeilen"));
		inputPanel.add(zeilenFeld);
		boolean ersteBedingung = false;
		do
		{
			final int spielfeldFestlegenAntwort = JOptionPane
					.showConfirmDialog(fenster, inputPanel);
			if (spielfeldFestlegenAntwort == JOptionPane.YES_OPTION)
			{
				final String spaltenString = spaltenFeld.getText();
				final String zeilenString = zeilenFeld.getText();
				try
				{
					spalten = Integer.parseInt(spaltenString);
					zeilen = Integer.parseInt(zeilenString);
					if (zeilen < 1 || spalten < 1)
					{
						throw new NumberFormatException();
					}
					ersteBedingung = false;
				}
				catch (NumberFormatException exception)
				{
					JOptionPane.showMessageDialog(inputPanel,
							"Die Anzahl der Zeilen / Spalten muss eine positive Zahl sein.");
					final int antwort = JOptionPane.showConfirmDialog(fenster,
							"Möchten Sie die Eingabe wiederholen?");
					if (antwort == JOptionPane.YES_OPTION)
					{
						ersteBedingung = true;
					}
					else
					{
						System.exit(0);
					}
				}
			}
			else
			{
				final int schliesenAntwort = JOptionPane.showConfirmDialog(
						inputPanel, "Wollen Sie das Spiel wirklich beenden?");
				if (schliesenAntwort == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				else
				{
					ersteBedingung = true;
				}
			}
		} while (ersteBedingung);
		panel = new JPanel(new GridLayout(zeilen, spalten));

		// Hundehaufen festlegen
		boolean bedingung = false;
		do
		{
			final String anzahlHundehaufenString = JOptionPane.showInputDialog(
					"Wie viele Hundehaufen möchten Sie auf dem Spielfeld haben?",
					20);
			try
			{
				anzahlHundehaufen = Integer.parseInt(anzahlHundehaufenString);
				if (anzahlHundehaufen < 1
						|| anzahlHundehaufen > (spalten * zeilen - 1))
				{
					throw new NumberFormatException();
				}
				bedingung = false;
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(fenster,
						"Die Anzahl der Hundehaufen muss eine positive Zahl sein und darf nicht mehr als eins weniger als ihre Spielfeldgröße betragen.");
				final int antwort = JOptionPane.showConfirmDialog(fenster,
						"Möchten Sie die Eingabe wiederholen?");
				if (antwort == JOptionPane.YES_OPTION)
				{
					bedingung = true;
				}
				else
				{
					System.exit(0);
				}
			}
		} while (bedingung);

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

		// Standard Groeße festlegen
		panel.setPreferredSize(new Dimension(320, 560));

		// Border / Rand festlegen
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Inhalts panel festlegen
		setContentPane(contentPane);

		// Minimale Groeße setzen
		// Das Fenster kann nicht kleiner als diese Groeße sein.
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
										"Möchten Sie das Spiel wirklich neustarten?");
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
		final Spiel spiel = new Spiel(anzahlHundehaufen, spalten, zeilen);

		// Start Platte aufdecken
		startPlatteAufdecken(spiel);

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
				if (!platte.leseIstAufgedeckt())
				{
					// wenn die platte nicht bereits zu Anfang aufgedeckt ist
					// (Startplatte) setzte sie als Gehwegplatte
					button.setIcon(zugedecktIcon);
				}
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
								if (platte.leseIstAufgedeckt())
								{
									return;
								}
								else
								{
									platte.setzteIstAufgedeckt();
									if (platte.istHundehaufenAufPlatte())
									{
										button.setIcon(kackeIcon);
										allePlattenAufdecken(spiel, kackeIcon);

										final int optiongewaehlt = JOptionPane
												.showConfirmDialog(null, spiel
														.verloren() + "\n"
														+ "Möchten Sie das Spiel neustarten?");
										switch (optiongewaehlt)
										{
											case JOptionPane.YES_OPTION:
												if (fenster != null)
												{
													fenster.setVisible(false);
													fenster.dispose();
												}
												fenster = new Spielfeld();
												fenster.setVisible(true);
												break;

											case JOptionPane.NO_OPTION:
												System.exit(0);
												break;

											default:
												break;
										}
									}
									else
									{
										// Angrenzende Hundehaufen anzeigen
										/*
										 * Icon "entfernen", damit genug Platz
										 * fuer die Zahl vorhanden ist
										 */
										button.setIcon(null);
										final int angrenzendeHundehaufen = spiel
												.leseAngrenzendeHundehaufen(
														platte.leseSpalte(),
														platte.leseZeile());
										button.setText(Integer.toString(
												angrenzendeHundehaufen));
										spiel.deckePlatteAuf();
										tstGewonnen(spiel);
									}
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
										tstGewonnen(spiel);
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

	/**
	 * Testes ob das Spiel gewonnen ist oder nicht.
	 * 
	 * @param spiel
	 *            - das aktuelle Spiel
	 */
	public void tstGewonnen(Spiel spiel)
	{
		if (spiel.hatGewonnen())
		{
			JOptionPane.showConfirmDialog(null,
					"Herzlichen Glückwunsch! \n Möchten Sie nochmal spielen?");
		}
	}

	/**
	 * Deckt alle Platten eines Spiels auf.
	 * 
	 * @param spiel
	 *            - das aktuelle Spiel
	 * @param kackeIcon
	 *            - Das Icon der Kacke
	 */
	public void allePlattenAufdecken(Spiel spiel, ImageIcon kackeIcon)
	{
		for (int zaehlerZeile = 0; zaehlerZeile < spiel
				.leseZeilen(); zaehlerZeile++)
		{
			// For-Schleife fuer die Spalten in einer Zeile
			for (int zaehlerSpalte = 0; zaehlerSpalte < spiel
					.leseSpalten(); zaehlerSpalte++)
			{
				Platte platte = spiel.lesePlatte(zaehlerSpalte, zaehlerZeile);
				// Platten aufdecken (Kacke wenn Kacke und lehre Platte wenn
				// keine Kacke auf Platte)
				if (platte.istHundehaufenAufPlatte())
				{
					platte.leseButton().setIcon(kackeIcon);
				}
				else
				{
					platte.leseButton().setIcon(null);
				}
				platte.leseButton().setEnabled(false);
			}
		}
	}

	/**
	 * Deckt eine beliebige Platte, auf welcher sich kein Hundehaufen befindet
	 * auf.
	 * 
	 * @param spiel
	 *            - Das aktuelle Spiel
	 */
	public void startPlatteAufdecken(Spiel spiel)
	{
		// Nach Verteilung der Platten: Startplatte aufdecken

		int plattenSpalte = (int) (Math.random() * spiel.leseSpalten());
		int plattenZeile = (int) (Math.random() * spiel.leseZeilen());

		final Platte platte = spiel.lesePlatte(plattenSpalte, plattenZeile);

		platte.setzteIstAufgedeckt();
		if (platte.istHundehaufenAufPlatte())
		{
			// falls ein Hundehaufen auf der zufälligen Startplatte ist, neue
			// Platte auswaehlen
			startPlatteAufdecken(spiel);
		}
		else
		{
			final JButton button = platte.leseButton();
			final int angrenzendeHundehaufen = spiel.leseAngrenzendeHundehaufen(
					platte.leseSpalte(), platte.leseZeile());
			button.setText(Integer.toString(angrenzendeHundehaufen));
		}
	}
}
