public class SteuerJ1 extends SteuerJ
{
    
    public SteuerJ1()
    {
       CF = 400000;
       Auszahlung= 50000;
       Tilgung= 75000;
       Zins = 12000;
       AbSt();
       GeSt();
       KoSt();
       NZRrechnen();
    }
  
    public double AnuZinsrechnen()
  {
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
