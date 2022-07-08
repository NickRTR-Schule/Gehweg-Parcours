package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import fachkonzept.Statistik;

public final class Dateisystem
{

	static private File file;

	static public void initialisiere()
	{
		file = new File("Gehweg-Parcours-Statistik.stat");
		if (file.exists())
		{
			return;
		}
		else
		{
			try
			{

				file.createNewFile();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	static public void speichereStatistik(Statistik statistik)
	{
		try
		{
			final FileOutputStream outputStream = new FileOutputStream(file);
			final ObjectOutputStream objectStream = new ObjectOutputStream(
					outputStream);

			objectStream.writeObject(statistik.leseAnzahlRichtigeFlaggen());
			objectStream.writeObject(statistik.leseAnzahlFalscheFlaggen());
			objectStream.writeObject(statistik.leseAnzahlAufgedecktePlatten());
			objectStream
					.writeObject(statistik.leseVermutungenZurueckgenommen());
			objectStream.writeObject(statistik.leseSpielzeit());

			objectStream.close();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
