public class SteuerJ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public double CF;
    private double AF;
    private double Abschreibung;
    private double InvestitionsauszahlungInJ0;
    private double Nutzungsdauer;
    public double Erloesung;
    public double Gewerbesteuer;
    public double Koeperschaftsteuer;
    public double NZR;
    public double NPV;
    public double Ia;
    public double Iv;
    public double Auszahlung;
    public double Gewerbeertragsteuersatz;
    public double Koeperschaftsteuersatz;
    public double Abgeltungsteuersatz;
    public double Abgeltungsteuer;
    public double Zins;
    public double Tilgung;
    public double CashnachUST;
    public double FK;
    public double AnuF;
    public double Anu;
    public double Ias;
    /**
     * Konstruktor für Objekte der Klasse STEUER
     */
    public SteuerJ()
    { 
        AF= 1200000;
        Nutzungsdauer = 4;
        FK=300000;
        Abschreibung = 300000;
        InvestitionsauszahlungInJ0=0;
        Gewerbeertragsteuersatz = 0.14;
        Koeperschaftsteuersatz = 0.15;
        Abgeltungsteuersatz = 0.25;
        Ia=0.03;
        Iv=0.04;
        Ias = Ia*(1-Abgeltungsteuersatz);
        AnuF=((Math.pow(1+Iv,Nutzungsdauer))*Iv)/(Math.pow(1+Iv,Nutzungsdauer)-1);
        Anu=AnuF*FK;
    }

    public double GeSt()
    {
        Gewerbesteuer = (CF-Auszahlung-Abschreibung-0.75*Zins+Erloesung)*Gewerbeertragsteuersatz;
        return Gewerbesteuer;
    }
    
    public double KoSt()
    {
        Koeperschaftsteuer = (CF-Auszahlung-Abschreibung-Zins+Erloesung)*Koeperschaftsteuersatz;
        return Koeperschaftsteuer;
    }
    
    public double AbSt()
    { 
        GeSt();
        KoSt();
        CashnachUST= CF-Gewerbesteuer-Koeperschaftsteuer
        -Auszahlung-Zins-Tilgung+Erloesung;
        Abgeltungsteuer = CashnachUST*Abgeltungsteuersatz;
        return Abgeltungsteuer;
    } 
    
    public double NZRrechnen()
    {
        GeSt();
        KoSt();
        AbSt();
        NZR = CashnachUST-Abgeltungsteuer;
        return NZR;
    }
    
    public double NPVrechnen( double NZRJ1, double NZRJ2,double NZRJ3, double NZRJ4)
    {
        NPV= NZRJ1*Math.pow((1+Ias),-1)
        +NZRJ2*Math.pow((1+Ias),-2) 
        +NZRJ3*Math.pow((1+Ias),-3)
        +NZRJ4*Math.pow((1+Ias),-4)
        -AF+FK-InvestitionsauszahlungInJ0;
        return NPV;
    }
    
    public double AnuFrechnen()
    {
        AnuF=((Math.pow(1+Iv,Nutzungsdauer))*Iv)/(Math.pow(1+Iv,Nutzungsdauer)-1);
        Anu=AnuF*FK;
        return AnuF;
    }
    
    public double Anurechnen()
    {
        AnuF=((Math.pow(1+Iv,Nutzungsdauer))*Iv)/(Math.pow(1+Iv,Nutzungsdauer)-1);
        Anu=AnuF*FK;
        return Anu;
    }
    
      public double ZeroTilgung()
    {
      Tilgung = FK*Math.pow(1+Iv,Nutzungsdauer);
      return Tilgung;
    }
}

    
    
    
    
