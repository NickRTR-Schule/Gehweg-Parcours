package fachkonzept;

/**
 * Dieses Objekt repraesentiert das Spiel. Hier findet die Logik des Hundehaufen
 * verteilens statt. Auﬂerdem haelt dieses Objekt das Spielfeld und deren Maﬂe.
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
		int angrenzendeHundehaufenZ‰hler = 0;
		for (int s = plattenSpalte--; s < plattenSpalte++; s++)
		{
			for (int z = plattenZeile--; z < plattenZeile--; z++)
			{
				if (spielfeld[s][z].istHundehaufenAufPlatte())
				{
					angrenzendeHundehaufenZ‰hler++;
				}
			}
		}
		return angrenzendeHundehaufenZ‰hler;
	}

	/**
	 * Diese Methode verteilt zufaellig die Hundehaufen auf den Platten
	 */
	private void verteileHundehaufen()
	{

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
}
