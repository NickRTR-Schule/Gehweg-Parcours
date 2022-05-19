package fachkonzept;

public final class Spiel
{
	private final String[][] spielfeld;

	public Spiel()
	{
		verteileHundehaufen();
		spielfeld = new String[6][14];
	}

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
