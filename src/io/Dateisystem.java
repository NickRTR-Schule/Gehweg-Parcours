package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import fachkonzept.Statistik;

/**
 * Ist zuständig für alle Operationen welche das laden und speichern von Dateien
 * und Objekten betreffen.
 * 
 * @author julianschumacher
 */
public final class Dateisystem
{

	static private File file = new File("Gehweg-Parcours-Statistik.stat");

	/**
	 * Speichert die übergebene Statistik
	 * 
	 * @param statistik
	 *            - die zu speichernde Statistik
	 */
	static public void speichereStatistik()
	{
		if (!file.exists())
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
		try
		{
			final FileOutputStream outputStream = new FileOutputStream(file);
			final ObjectOutputStream objectStream = new ObjectOutputStream(
					outputStream);

			objectStream.writeObject(Statistik.statistiken);
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
	@SuppressWarnings("unchecked")
	static public void ladeStatistik()
	{
		if (file.exists())
		{
			try
			{
				FileInputStream inputStream = new FileInputStream(file);
				ObjectInputStream objectStream = new ObjectInputStream(
						inputStream);
				Statistik.statistiken = (ArrayList<Statistik>) objectStream
						.readObject();
				objectStream.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
