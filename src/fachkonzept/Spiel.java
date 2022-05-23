package fachkonzept;

import java.util.Random;

/**
 * Dieses Objekt repraesentiert das Spiel. Hier findet die Logik des Hundehaufen
 * verteilens statt. Au�erdem haelt dieses Objekt das Spielfeld und deren Ma�e.
 * 
 * @author julianschumacher
 *
 */
public final class Spiel
{
	/**
	 * Dieses 2D-Array repraesentiert das Spielfeld. Das erste Array steht fuer
	 * die Spalten. Das "zweite", also das Array im Array, steht fuer di Zeilen
	 * pro Spalte
	 */
	private final Platte[][] spielfeld;

	private int anzahlHundehaufen = 20;

	public Spiel()
	{
		spielfeld = new Platte[6][14];
		initialisieren();
		verteileHundehaufen();
	}

	/**
	 * Initialisiert das Spiel und erstellt alle Platten
	 */
	private void initialisieren()
	{
		for (int zaehlerSpalte = 0; zaehlerSpalte < leseSpalten(); zaehlerSpalte++)
		{
			for (int zaehlerZeile = 0; zaehlerZeile < leseZeilen(); zaehlerZeile++)
			{
				spielfeld[zaehlerSpalte][zaehlerZeile] = new Platte(
						zaehlerSpalte, zaehlerZeile);
			}
		}
	}

	/**
	 * Gibt die Platte an den angegebenen Koordinaten zurueck
	 * 
	 * @param spalte
	 *            - Die Spalte auf dem Spielfeld
	 * @param zeile
	 *            - Die Zeile auf dem Spielfeld
	 * @return platte - Die Platte, an den angegebenen Koordianten (spalte und
	 *         zeile)
	 */
	public Platte lesePlatte(int spalte, int zeile)
	{
		return spielfeld[spalte][zeile];
	}

	/**
	 * Gibt die Anzahl der angrenzenden Hundehaufen zu dieser Platte zurueck
	 * 
	 * @return Ganzzahl
	 */
	public int leseAngrenzendeHundehaufen(int plattenSpalte, int plattenZeile)
	{
		// TODO: Wenn auf eine Platte am Rand des Spielfelds gedrückt wird, gibt
		// es eine Exception, da -1 nicht im Spielfeld Array ist.

		int angrenzendeHundehaufenZaehler = 0;

		for (int s = plattenSpalte - 1; s <= plattenSpalte + 1; s++)
		{
			for (int z = plattenZeile - 1; z <= plattenZeile + 1; z++)
			{
				if (s < spielfeld.length && z < spielfeld[0].length && s >= 0
						&& z >= 0)
				{

					if (spielfeld[s][z].istHundehaufenAufPlatte())
					{
						angrenzendeHundehaufenZaehler++;
					}
				}
			}
		}
		return angrenzendeHundehaufenZaehler;
	}

	/**
	 * Diese Methode verteilt zufaellig die Hundehaufen auf den Platten
	 */
	private void verteileHundehaufen()
	{
		Random random = new Random();
		do
		{
			final int zeile = random.nextInt(leseZeilen());
			final int spalte = random.nextInt(leseSpalten());
			final Platte platte = spielfeld[spalte][zeile];
			if (!platte.istHundehaufenAufPlatte())
			{
				platte.setzeHundehaufen();
				anzahlHundehaufen--;
			}
		} while (anzahlHundehaufen != 0);
	}

	/**
	 * Gibt die Anzahl der Spalten zurueck
	 * 
	 * @return Ganzzahl
	 */
	public int leseSpalten()
	{
		return spielfeld.length;
	}

	/**
	 * Gibt die Anzahl der Zeilen zurueck
	 * 
	 * @return Ganzzahl
	 */
	public int leseZeilen()
	{
		return spielfeld[0].length;
	}

	public String verloren()
	{
		return "Sie sind in Kacke getreten!";
	}
}
