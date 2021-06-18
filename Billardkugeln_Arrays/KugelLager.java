package Billardkugeln_Arrays;

public class KugelLager
{
    private Kugel[] KugelLager;
    public KugelLager()
    {
        KugelLager = new Kugel[14];
        Kugel Kugel1 = new Kugel(1, "gelb", false);
        LegeKugelInsLagerAb(0, Kugel1);
    }
    
    public void LegeKugelInsLagerAb(int n, Kugel AbzulegendeKugel){
        KugelLager[n] = AbzulegendeKugel;
    }
    
    public Kugel getKugelAnStelleAusDemLager(int n){
        return KugelLager[n];
    }
}
