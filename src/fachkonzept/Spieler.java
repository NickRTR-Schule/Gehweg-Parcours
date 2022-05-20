package fachkonzept;

public class Spieler
{
	private int positionSpalte = 0;
	private int positionZeile = 0;

	public void setzePosition(int spalte, int zeile)
	{
		positionSpalte = spalte;
		positionZeile = zeile;
	}

	public int liesSpielerPositionSpalte()
	{
		return positionSpalte;
	}

	public int liesSpielerPositionZeile()
	{
		return positionZeile;
	}

	public void vermutungSetzen()
	{
		
	}
	
	// TODO: unnötig?
	// public void laufeRechts()
	// {
		
	// }
	
	// public void laufeLinks()
	// {
		
	// }
	
	// public void laufeOben()
	// {
		
	// }
	
	// public void laufeUnten()
	// {
		
	// }
	
	// public void laufeNordOst()
	// {
		
	// }
	
	// public void laufeSuedOst()
	// {
		
	// }
	
	// public void laufeSuedWest()
	// {
		
	// }
	
	// public void laufeNordWest()
	// {
		
	// }
}
