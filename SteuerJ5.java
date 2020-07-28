public class SteuerJ5 extends SteuerJ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse SteuerJ1
     */
    public SteuerJ5()
    {
       CF = 1600;
       Auszahlung= 0;
       Tilgung= 0;
       Zins = 0;
       Erloesung = 0;
       AbSt();
       GeSt();
       KoSt();
       NZRrechnen();
    }
    
       public double AnuZinsrechnen()
  {
      FK = (((FK*(1+Iv)-Anu)*(1+Iv)-Anu)*(1+Iv)-Anu)*(1+Iv)-Anu;
      Zins = FK*Iv;
      return Zins;
    }
    
  public double AnuTilgungrechnen()
   {
       AnuZinsrechnen();
       Tilgung = Anu-Zins;
       return Tilgung;
    }

}
