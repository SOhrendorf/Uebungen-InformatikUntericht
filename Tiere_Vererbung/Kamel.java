package Tiere_Vererbung;


/**
 * Dies ist die Oberklasse Kamel.
 * Davon werden voraussichtlich folgende Unterklassen erben:
 * - lama, 
 * - Dromedar,
 *  - Trampeltier
 * 
 * @author (Simon Ohrendorf) 
 * @version (0.1 von 06.05.2021)
 */
public class Kamel
{
    // Instanzvariablen
    protected String name;
    protected int jahrgang; 
    /**
     * Konstruktor für Objekte der Klasse Kamel
     * 
     * @param pName initialisierungsname 
     * @param pJahrgang Jahrgang zum initialisieren
     * @return nothing
     */
    public Kamel(String pName, int pJahrgang)
    {
        // Instanzvariable initialisieren
        name = pName;
        jahrgang = pJahrgang;
    }

    /**
     * Methode: "getLeistung"
     * 
     * @return        die Leistung
     */
    public double leistung()
    {
        //hier würde ein double returnt
        return 42;
    }
    
    /**
     * Methode: "getAlter"
     * 
     * @return        das Alter
     */
    public int alter()
    {
        //hier würde ein int returnt
        return 42; 
    }
    /**
     * Methode: hier wird die Tragelast überprüft oder ähnliches
     * 
     * @return        nothing
     */
    public void trageLast(double pKg)
    {
        //den Wert pKg verarbeitetn und nichts zurückgeben
    }
}
