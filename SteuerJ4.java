public class SteuerJ4 extends SteuerJ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse SteuerJ1
     */
    public SteuerJ4()
    {
       CF = 550000;
       Auszahlung= 57881.25;
       Tilgung= 75000;
       Zins = 3000;
       AbSt();
       GeSt();
       KoSt();
       NZRrechnen();
    }
          public double AnuZinsrechnen()
  {
      FK = ((FK*(1+Iv)-Anu)*(1+Iv)-Anu)*(1+Iv)-Anu;
      Zins = (FK-Anu*3)*Iv;
      return Zins;
    }
    
  public double AnuTilgungrechnen()
   {
       AnuZinsrechnen();
       Tilgung = Anu-Zins;
       return Tilgung;
    }

}