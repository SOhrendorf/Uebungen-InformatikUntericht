package Hochzeit_Implemntieren;


/**
 * Äquivalent zu Brautigam
 * 
 * @author Simon Ohrendorf 
 * @version V.0.1 20.05.2021
 */
public class Braut
{
    // Instanzvariablen
    protected String vorname;
    protected String nachname;
    protected int persoNr;
    protected boolean verheiratet;
    protected int hochzeitstag;
    protected boolean ring;
    

    /**
     * Konstruktor für Objekte der Klasse Braut
     */
    public Braut(String pVorname, String pNachname, int pPersoNr, int pHochzeitstag)
    {
        // Instanzvariable initialisieren
        vorname = pVorname; 
        nachname = pNachname;
        persoNr = pPersoNr;
        verheiratet = false;
        hochzeitstag = pHochzeitstag;
        ring = false;
    }
    
    
    public String getVorname(){
        return vorname;
    }
    
    public void setHochzeitstag(int pHochzeitstag){
        hochzeitstag = pHochzeitstag;
    }
}
