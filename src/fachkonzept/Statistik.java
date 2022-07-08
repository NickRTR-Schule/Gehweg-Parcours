package fachkonzept;

import java.util.Date;

/**
 * Statistik. Diese represäntiert eine Spielrunde. Enthält alle Informationen
 * über wie viele Platten aufgedeckt wurden, wie viele richtig waren etc...
 * 
 * @author julianschumacher
 *
 */
public final class Statistik
{
	private final double durchschnittlicheDenkzeit;
	private final int anzahlRichtigeFlaggen;
	private final int anzahlFalscheFlaggen;
	private final int vermutungenZurueckgenommen;
	private final int anzahlAufgedecktePlatten;
	private final int flaggenGesamt;
	private final Date datum;
	private final double spielzeit;

	public Statistik(int anzahlRichtigeFlaggen, int anzahlFalscheFlaggen,
			int anzahlAufgedecktePlatten, int vermutungenZurueckgenommen,
			double spielzeit)
	{
		this.anzahlRichtigeFlaggen = anzahlRichtigeFlaggen;
		this.anzahlFalscheFlaggen = anzahlFalscheFlaggen;
		this.anzahlAufgedecktePlatten = anzahlAufgedecktePlatten;
		this.vermutungenZurueckgenommen = vermutungenZurueckgenommen;
		this.spielzeit = spielzeit;
		flaggenGesamt = anzahlRichtigeFlaggen + anzahlFalscheFlaggen
				+ vermutungenZurueckgenommen;
		durchschnittlicheDenkzeit = spielzeit / flaggenGesamt;
		datum = new Date();
	}

	public double leseDurchschnittlicheDenkzeit()
	{
		return durchschnittlicheDenkzeit;
	}

	public int leseAnzahlRichtigeFlaggen()
	{
		return anzahlRichtigeFlaggen;
	}

	public int leseAnzahlFalscheFlaggen()
	{
		return anzahlFalscheFlaggen;
	}

	public int leseVermutungenZurueckgenommen()
	{
		return vermutungenZurueckgenommen;
	}

	public int leseAnzahlAufgedecktePlatten()
	{
		return anzahlAufgedecktePlatten;
	}

	public int leseFlaggenGesamt()
	{
		return flaggenGesamt;
	}

	public Date leseDatum()
	{
		return datum;
	}

	public double leseSpielzeit()
	{
		return spielzeit;
	}
}
