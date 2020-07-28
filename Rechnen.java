public class Rechnen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    public double AnuF;
    public double Anu;
    public double appIRR;

    /**
     * Konstruktor für Objekte der Klasse AnuRechnen
     */
    public Rechnen()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
     public double AnuFrechnen(double Iv, double Nutzungsdauer)
    {
        AnuF=((Math.pow(1+Iv,Nutzungsdauer))*Iv)/(Math.pow(1+Iv,Nutzungsdauer)-1);
        
        return AnuF;
    }
    
     public double appIRR(double i1, double i2, double NPV1, double NPV2)
    {
        appIRR = i1 +(i2-i1)*NPV1/(NPV1-NPV2);
        
        return appIRR;
    }
}
