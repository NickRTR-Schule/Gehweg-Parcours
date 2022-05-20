package benutzerschnittstelle;

/**
 * Diese Klasse wird für debug und Log Funktionen benutzt. Sie hat keine
 * Auswirkungen auf das Spiel an sich.
 * 
 * @author julianschumacher
 *
 */
public final class Konsole
{
	/**
	 * Loggt etwas in die Konsole. Wird benutzt für Debugging, Testen und eben
	 * Logging.
	 * 
	 * @param nachricht
	 *            - Eine Zeichenfolge die ausgegeben werden soll
	 */
	static void log(String nachricht)
	{
		System.out.println(nachricht);
	}
}
