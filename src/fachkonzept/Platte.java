package fachkonzept;

/**
 * Dieses Objekt repraesentiert eine einzelne Platte im Spiel.
 * 
 * @author julianschumacher
 *
 */
public final class Platte
{
	private boolean hatHundehaufen;

	// Nachfolgende Variablen repraesentieren die Position der Platte
	// auf dem Spielfeld
	private final int spalte;
	private final int zeile;

	public Platte(int pSpalte, int pZeile)
	{
		spalte = pSpalte;
		zeile = pZeile;
		hatHundehaufen = false;
	}
	
	public void setzeHundehaufen() 
	{
		hatHundehaufen = true;
	}

	/**
	 * Gibt zurueck, ob der Spieler sich auf dieser Platte befindet oder nicht.
	 * 
	 * @return wahr oder falsch
	 */
	public boolean istSpielerAufPlatte()
	{
		return false;
	}

	/**
	 * Gibt zurueck, ob sich ein Hundehaufen auf dieser Platte befindet oder
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
	 * Gibt nur die Spalte der Position der Platte zurueck
	 * 
	 * @return Ganzzahl
	 */
	public int leseSpalte()
	{
		return spalte;
	}

	/**
	 * Gibt nur die Zeile der Position zurueck
	 * 
	 * @return Ganzzahl
	 */
	public int leseZeile()
	{
		return zeile;
	}

}
