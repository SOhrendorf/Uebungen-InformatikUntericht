package Comicfiguren_Vererbung;

public class Comicfiguren
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variable
    String name;
    int geburtsjahr;
    String heimatort;
    String comicnamen;
    String geschlecht;
    /**
     * Konstruktor für Objekte der Klasse Comicfiguren
     */
    public Comicfiguren(String pName, int pGeburtsjahr, String pHeimatort, String pComicname, String pGeschlecht)
    {
        // Instanzvariable initialisieren
        name = pName;
        geburtsjahr = pGeburtsjahr;
        heimatort = pHeimatort;
        comicnamen = pComicname;
        geschlecht = pGeschlecht;
    }
    protected void sprechen(){
     //hier sprechen   
    }
}
