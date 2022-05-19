package fachkonzept;

/**
 * Dieses Objekt repräsentiert das Spiel. Hier findet die Logik des Hundehaufen
 * verteilens statt. Außerdem hält dieses Objekt das Spielfeld und deren Maße.
 * 
 * @author julianschumacher
 *
 */
public final class Spiel
{
	/**
	 * Dieses 2D-Array repräsentiert das Spielfeld. Das erste Array steht für
	 * die Spalten. Das "zweite", also das Array im Array, steht für di Zeilen
	 * pro Spalte
	 */
	private final String[][] spielfeld;

	public Spiel()
	{
		verteileHundehaufen();
		spielfeld = new String[6][14];
	}

	/**
	 * Gibt die Platte an den angegebenen Koordinaten zurück
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
	 * Diese Methode verteilt zufällig die Hundehaufen auf den Platten
	 */
	private void verteileHundehaufen()
	{

	}

	/**
	 * Gibt die Anzahl der Spalten zurück
	 * 
	 * @return Ganzzahl
	 */
	public int leseSpalten()
	{
		return spielfeld.length;
	}

	/**
	 * Gibt die Anzahl der Zeilen zurück
	 * 
	 * @return Ganzzahl
	 */
	public int leseZeilen()
	{
		return spielfeld[0].length;
	}
}
