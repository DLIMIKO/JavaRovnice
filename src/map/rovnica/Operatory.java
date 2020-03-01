package map.rovnica;

public class Operatory

{

   double a;
   double b;
   double c;
   double d;



    public Operatory(Koren K, Koren L)
    {
        a=K.getRealCast();
        b=K.getKomplCast();
        c=L.getRealCast();
        d=L.getKomplCast();
    }

    public Koren Sum()
    {
        return new Koren(a+c, b+d);
    }
    public Koren Mul()
    {
       //ac +adi+cbi-bd
       return new Koren(a*c-b*d,a*d+c*b);
    }

}


