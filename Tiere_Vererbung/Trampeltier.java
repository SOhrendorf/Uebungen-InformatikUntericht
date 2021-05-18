package Tiere_Vererbung;


/**
 * Dies ist die Klasse Trampeltier; erbt von Kamel. 
 * Sie besitzt die besondere Variable maxPassagier und Methode touristenAusfueren.
 * 
 * @author (Simon Ohrendorf) 
 * @version (0.1 von 06.05.2021)
 */
public class Trampeltier extends Kamel
{
    // Instanzvariablen
    private int maxPassagier;

    /**
     * Konstruktor für Objekte der Klasse Trampeltier
     * 
     * @param die Parameter für die Oberklasse
     * @param pMaxPassagier maximale Anzahl der Passagiere zum initalisieren
     * @return nothing
     */
    public Trampeltier(String pName, int pJahrgang, int pMaxPassagier)
    {
        // Instanzvariable initialisieren
        super(pName, pJahrgang);
        maxPassagier = pMaxPassagier;
    }

    /**
     * Hier setzt sich das Trampeltier mir den Passagieren in Bewegung
     */
    public void touristenAusfueren()
    {
        //touristen bewegen
    }
}
