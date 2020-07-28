public class SteuerJ2 extends SteuerJ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse SteuerJ1
     */
    public SteuerJ2()
    {
       CF = 500000;
       Auszahlung= 52500;
       Tilgung= 75000;
       Zins = 9000;
       AbSt();
       GeSt();
       KoSt();
       NZRrechnen();
    }
    
     public double AnuZinsrechnen()
  {
      FK = FK*(1+Iv)-Anu;
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
