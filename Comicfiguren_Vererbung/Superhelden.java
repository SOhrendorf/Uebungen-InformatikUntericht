package Comicfiguren_Vererbung;

public class Superhelden extends Comicfiguren
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    String feahigkeit;
    /**
     * Konstruktor für Objekte der Klasse Superhelden
     */
    public Superhelden(String pFaehigkeit, String pName, int pGeburtsjahr, String pHeimatort, String pComicname, String pGeschlecht)
    {
        // Instanzvariable initialisieren
        super(pName, pGeburtsjahr, pHeimatort, pComicname, pGeschlecht);
        feahigkeit = pFaehigkeit; 
    }
    
    public void fliegen(){
        //abheben
    }
    
    public void kaempfen(){
        //schlagen
    }
}
