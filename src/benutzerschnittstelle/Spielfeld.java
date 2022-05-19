package benutzerschnittstelle;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
 * GUI Klasse des Programms Gehweg-Pacrcours
 * 
 * @author julianschumacher
 *
 */
public final class Spielfeld extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// Constraints für den Inhalt erstellen
	private final GridBagConstraints constraints = new GridBagConstraints();

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
					Spielfeld frame = new Spielfeld();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Spielfeld()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		// Titel des Fensters festlegen
		setTitle("Gehweg-Parcours");

		// Möglichkeit das Fenster zu skalieren aktivieren
		setResizable(true);

		// Das Fenster selbst aktivieren
		setEnabled(true);

		// Die Sprache auf Deutsch setzen
		setLocale(new Locale("de"));

		// Objekte zu dem Fenster hinzuzufügen
		objekteHinzufügen();
	}

	private void objekteHinzufügen()
	{
		// erstelle Spiel
		final Spiel spiel = new Spiel();
		for (int zählerSpalte = 0; zählerSpalte < spiel
				.leseSpalten(); zählerSpalte++)
		{
			for (int zählerZeile = 0; zählerZeile < spiel
					.leseZeilen(); zählerZeile++)
			{
				// Icon für die zugedeckten Platten
				final ImageIcon icon = new ImageIcon("../assets/zugedeckt.png");
				// Knopf erstellen
				final JButton button = new JButton();
				// Platte an der aktuellen Position bekommen
				final Platte platte = spiel.lesePlatte(zählerSpalte,
						zählerZeile);
				// Icon festlegen
				button.setIcon(icon);
				// MouseListener hinzufügen
				button.addMouseListener(new MouseListener()
				{

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
								button.setIcon(
										new ImageIcon("../assets/Kacke.png"));
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
								button.setIcon(
										new ImageIcon("../assets/Fahne.png"));
							}
							else
							{

							}
						}

					}
				});
				constraints.gridx = zählerSpalte;
				constraints.gridy = zählerZeile;
				contentPane.add(button, constraints);
			}
		}
	}

}
