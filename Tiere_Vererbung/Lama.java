package Tiere_Vererbung;


/**
 * Dies ist die Klasse Lama; erbt von Kamel. 
 * Sie besitzt die besondere Variable Farbe und Methode spucken.
 * 
 * @author (Simon Ohrendorf) 
 * @version (0.1 von 06.05.2021)
 */
public class Lama extends Kamel
{
    // Instanzvariablen 
    private String farbe;

    /**
     * Konstruktor für Objekte der Klasse Lama
     * @param die Parameter für die Oberklasse
     * @param pFarbe Farbe zum initalisieren
     * @return nothing
     */
    public Lama(String pName, int pJahrgang, String pFarbe)
    {
        // Instanzvariable initialisieren
        super(pName, pJahrgang);
        farbe = pFarbe; 
    }

    /**
     * Ein Methode die das Lama spucken lässt. 
     */
    public void spucken()
    {
        //Vorsicht, diese Methode wird spucken ;D
    }
}
