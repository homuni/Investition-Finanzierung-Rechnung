public class SteuerJ3 extends SteuerJ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse SteuerJ1
     */
    public SteuerJ3()
    {
       CF = 525000;
       Auszahlung= 55125;
       Tilgung= 75000;
       Zins = 6000;
       Erloesung = 0;
       AbSt();
       GeSt();
       KoSt();
       NZRrechnen();
    }
    
       public double AnuZinsrechnen()
  {
      FK = (FK*(1+Iv)-Anu)*(1+Iv)-Anu;
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