/**
 * 
 */
package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fachkonzept.Platte;
import fachkonzept.Spiel;

/**
 * Testklasse fuer das Spiel.
 * 
 * @author julianschumacher
 *
 */
public class SpielTest
{

	/**
	 * Test method for {@link fachkonzept.Spiel#verteileHundehaufen()}.
	 */
	@Test
	public void testVerteileHundehaufen()
	{
		final Spiel spiel = new Spiel();
		int hundehaufen = 0;
		for (int s = 0; s < spiel.leseSpalten(); s++)
		{
			for (int z = 0; z < spiel.leseZeilen(); z++)
			{
				final Platte platte = spiel.lesePlatte(s, z);
				if (platte.istHundehaufenAufPlatte())
				{
					hundehaufen++;
				}
				else
				{
					continue;
				}
			}
		}
		assertEquals(20, hundehaufen);
	}

}
