package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fachkonzept.Statistik;

/**
 * Ist zuständig für alle Operationen welche das laden und speichern von Dateien
 * und Objekten betreffen.
 * 
 * @author julianschumacher
 */
public final class Dateisystem
{

	static private File file;

	/**
	 * Initialisiert alle Varaiblen die für das Speichern und laden von Dateien
	 * benötigt werden.
	 */
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

	/**
	 * Speichert die übergebene Statistik
	 * 
	 * @param statistik
	 *            - die zu speichernde Statistik
	 */
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

	/**
	 * Lädt die Statistik vom Dateisystem.
	 */
	static public void ladeStatistik()
	{
		try
		{
			FileInputStream inputStream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(inputStream);
			// Vaiarble erstellen
			Statistik statistik;

			while (objectStream.available() > 0)
			{
				statistik = new Statistik(objectStream.readInt(),
						objectStream.readInt(), objectStream.readInt(),
						objectStream.readInt(), objectStream.readDouble());
				Statistik.statistiken.add(statistik);
			}

			objectStream.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
