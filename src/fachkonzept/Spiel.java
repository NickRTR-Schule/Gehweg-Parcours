package fachkonzept;

/**
 * Dieses Objekt repraesentiert das Spiel. Hier findet die Logik des Hundehaufen
 * verteilens statt. Außerdem haelt dieses Objekt das Spielfeld und deren Maße.
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
	private final String[][] spielfeld;

	public Spiel()
	{
		verteileHundehaufen();
		spielfeld = new String[6][14];
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
		return new Platte(spalte, zeile);
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
