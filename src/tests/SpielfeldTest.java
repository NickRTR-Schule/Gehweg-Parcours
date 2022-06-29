package tests;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

import benutzerschnittstelle.Spielfeld;
import fachkonzept.Spiel;

public class SpielfeldTest
{

	@Test
	public void testStartPlatteAufdecken() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException
	{
		int anzahlAufgedeckt = 0;
		final Spielfeld spielfeld = new Spielfeld();
		final Field spielField = spielfeld.getClass().getDeclaredField("spiel");
		spielField.setAccessible(true);

		final Spiel spiel = (Spiel) spielField.get(spielfeld);

		for (int i = 0; i < spiel.leseSpalten(); i++)
		{
			for (int j = 0; j < spiel.leseZeilen(); j++)
			{
				if (spiel.lesePlatte(i, j).leseIstAufgedeckt())
				{
					anzahlAufgedeckt++;
				}
				else
				{
					continue;
				}
			}
		}
		assertEquals(anzahlAufgedeckt, 1);
	}

}
