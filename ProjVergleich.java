public class ProjVergleich
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public double Anschaffungskosten;
    public double Nutzungsdauer;
    public double Absatzmengeprojahr;
    public double fixKostenprojahr;
    public double varKosprojahr;
    public double Verkaufskreis;
    public double Zinssatz;
    public double GesKos;
    public double GesGew;
    public double KalAb;
    public double KalZins;
    public double Rent;
    public double AmoD;

    /**
     * Konstruktor für Objekte der Klasse Vergleichen
     */
    public ProjVergleich()
    {
        Anschaffungskosten = 120000;
        Nutzungsdauer =4;
        Absatzmengeprojahr=24000;
        fixKostenprojahr=8500+24800+2700;
        varKosprojahr=Absatzmengeprojahr*0.07;
        Verkaufskreis=3.75;
        Zinssatz = 0.02;
        KalAb = Anschaffungskosten/Nutzungsdauer;
        KalZins = (Anschaffungskosten/2)*Zinssatz;
        kostenVergleichung();
        GewinnVergleichung();
        RenVergleichung();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public double kostenVergleichung()
    {
        // tragen Sie hier den Code ein
        GesKos = fixKostenprojahr + varKosprojahr + KalAb + KalZins;
        return GesKos;
    }
    
    public double GewinnVergleichung()
    
    { 
        kostenVergleichung();
        GesGew = Verkaufskreis*Absatzmengeprojahr-GesKos;
        return GesGew;
    }
    
    public double RenVergleichung()
    
    {
        kostenVergleichung();
        GewinnVergleichung();
        Rent=(GesGew+KalZins)/(Anschaffungskosten/2);
        return Rent;
    }
    
    public double Amo()
    {
        kostenVergleichung();
        GewinnVergleichung();
        RenVergleichung();
        AmoD=Anschaffungskosten/(KalAb+GesGew+KalZins);
        return AmoD;
    }
}
