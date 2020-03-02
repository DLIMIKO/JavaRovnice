package map.rovnica;

public class kubicka extends rovnica
{
    private double c;
    private double d;

    public kubicka(double A, double B, double C, double D)
    {
        a=A;
        b=B;
        c=C;
        d=D;
    }

    kubicka(double A)
    {
        this(A,A,A,A);
    }

    kubicka()
    {
     a= getDouble(false, "Nula nie!");
     b= getDouble(true,"");
     c= getDouble(true,"");
     d= getDouble(true,"");

    }

   //inicializácia pomocou koreňov v R

    kubicka(boolean koren, double K1, double K2, double K3)
    {


        a=1;
        b=-(K1+K2+K3);
        c=K1*(K2+K3)+K2*K3;
        d=-(K1*K2*K3);

    }

    //inicializácia pomocou koreňov v C

    kubicka (double K1, Koren K2, Koren K3)
    {

        Operatory OP1=new Operatory(K2, K3);



        a=1;
        b=-(K1+OP1.Sum().getRealCast());
        c=K1*(OP1.Sum().getRealCast())+OP1.Mul().getRealCast();
        d=-(K1*OP1.Mul().getRealCast());

    }




    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^3 %+.2fx^2 %+.2fx %+.2f=0\n",a,b,c,d);
    }

    @Override
    public Koren[] getKorene()
    {




        //1. normalizujeme a subst. na x=y-b/3a a mat úpravou dostaneme rovn.: y^3+py+q=0 a určíme diskriminant


        double p = (3*c*a-Math.pow(b,2))/(3*Math.pow(a,2));
        double q = (2*Math.pow(b,3)-9*a*b*c+27*d*Math.pow(a,2))/(27*Math.pow(a,3));
        double D = (Math.pow(p,3))/(27)+(Math.pow(q,2))/(4);

     if(D>=0)
     {
        //2. nájeme čísla v a w, pre kt. platí v+w-b/3a=x

         double v = Math.cbrt(-q/2+Math.sqrt(D));
         double w = Math.cbrt(-q/2-Math.sqrt(D));

         Koren K1 = new Koren((v+w-b/(3*a)));
         Koren K2 = new Koren((-(w+v)/2-b/(3*a)), (Math.sqrt(3)*((w-v))/2));
         Koren K3 = new Koren((-(w+v)/2-b/(3*a)), -(Math.sqrt(3)*((w-v))/2));

         return new Koren[]{K1,K2,K3};
     }
    //3. riešime situáciu D<0, tj. odmocnina z komplex. čísla
     else
         {
            double r = Math.sqrt((Math.pow((-q/2),2)) + -D);
            double fi = Math.atan(-2*Math.sqrt(-D)/q);


           if(fi>=0)
           {
               Koren K1 = new Koren((2*Math.cbrt(r)*Math.cos(fi/3))-b/(3*a));
               Koren K2 = new Koren((2*Math.cbrt(r)*Math.cos((fi+2*Math.PI)/3))-b/(3*a));
               Koren K3 = new Koren((2*Math.cbrt(r)*Math.cos((fi+4*Math.PI)/3))-b/(3*a));
               return new Koren[]{K1,K2,K3};
           }


         //4. ak je fi<0, výsledky menia znamienko na opačné
           else {
               Koren K1 = new Koren((-2 * Math.cbrt(r) * Math.cos(fi / 3)) - b / (3 * a));
               Koren K2 = new Koren((-2 * Math.cbrt(r) * Math.cos((fi + 2 * Math.PI) / 3)) - b / (3 * a));
               Koren K3 = new Koren((-2 * Math.cbrt(r) * Math.cos((fi + 4 * Math.PI) / 3)) - b / (3 * a));
               return new Koren[]{K1, K2, K3};
           }
         }
    }



    @Override
    protected void vypisKorene()
    {
        System.out.print("Korene rovnice sú:\n K1= ");
        System.out.println(getKorene()[0]);
        System.out.print(" K2= ");
        System.out.println(getKorene()[1]);
        System.out.print(" K3= ");
        System.out.println(getKorene()[2]);


    }

    @Override
    public String toString()
    {
        return String.format("%.2fx^3 %+.2fx^2 %+.2fx %+.2f=0\n",a,b,c,d);
    }


}
