package Tiere_Vererbung;


/**
 * Dies ist die Klasse Dromedar; erbt von Kamel. 
 * Sie besitzt die besondere Variable werbeProdukt und Methode werben.
 * 
 * @author (Simon Ohrendorf) 
 * @version (0.1 von 06.05.2021)
 */
public class Dromedar extends Kamel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String werbeProdukt;
    /**
     * Konstruktor für Objekte der Klasse Dromedar
     * @param die Parameter für die Oberklasse
     * @param pWerbeProdukt zum initaliesieren des werbeProduktes
     * @return nothing
     */
    public Dromedar(String pName, int pJahrgang, String pWerbeProdukt)
    {
        // Instanzvariable initialisieren
        super(pName, pJahrgang);
        //super.name = pName;  alternatve Schreibweise
        //super.jahrgang = pJahrgang;
        werbeProdukt = pWerbeProdukt;
    }

    /**
     * hier fängt das Dromedar an zu tanzen für die Werbung
     */
    public void werben()
    {
        //das Dromedar tanzen lassen
    }
}
