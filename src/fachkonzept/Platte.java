package fachkonzept;

/**
 * Dieses Objekt repräsentiert eine einzelne Platte im Spiel.
 * 
 * @author julianschumacher
 *
 */
public final class Platte
{
	private boolean hatHundehaufen;

	// Nachfolgende Variablen repräsentieren die Position der Platte
	// auf dem Spielfeld
	private final int spalte;
	private final int zeile;

	public Platte(int pSpalte, int pZeile)
	{
		spalte = pSpalte;
		zeile = pZeile;
		hatHundehaufen = false;
	}

	/**
	 * Gibt zurück, ob der Spieler sich auf dieser Platte befindet oder nicht.
	 * 
	 * @return wahr oder falsch
	 */
	public boolean istSpielerAufPlatte()
	{

	}

	/**
	 * Gibt die Anzahl der angrenzenden Hundehaufen zu dieser Platte zurück
	 * 
	 * @return Ganzzahl
	 */
	public int leseAngrenzendeHundehaufen()
	{
	}

	/**
	 * Gibt zurück, ob sich ein Hundehaufen auf dieser Platte befindet oder
	 * nicht. Diese Methode kann benutzt werden, um herauszufinden, ob der
	 * Spieler verloren hat oder nicht.
	 * 
	 * @return wahr oder falsch
	 */
	public boolean istHundehaufenAufPlatte()
	{
		return hatHundehaufen;
	}

	/**
	 * Gibt nur die Spalte der Position der Platte zurück
	 * 
	 * @return Ganzzahl
	 */
	public int leseSpalte()
	{
		return spalte;
	}

	/**
	 * Gibt nur die Zeile der Position zurück
	 * 
	 * @return Ganzzahl
	 */
	public int leseZeile()
	{
		return zeile;
	}

}
