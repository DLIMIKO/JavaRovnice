package map.rovnica;

public class kubicka extends rovnica
{
    private double c;
    private double d;

    kubicka(double A, double B, double C, double D)
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



    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^3 %+.2fx^2 %+.2fx %+.2f=0\n",a,b,c,d);
    }

    @Override
    protected Koren[] getKorene()
    {




        //1. normalizujeme a subst. na x=y-r/3 a mat úpravou dostaneme rovn.: y^3+py+q=0

        double p = (3*c*a-Math.pow(b,2))/(3*Math.pow(a,2));
        double q = (2*Math.pow(b,3)-9*a*b*c+27*d*Math.pow(a,2))/(27*Math.pow(a,3));
        double D = (Math.pow(p,3))/(27)+(Math.pow(q,2))/(4);

     if(D>=0)
     {
         double v = Math.cbrt(-q/2+Math.sqrt(D));
         double w = Math.cbrt(-q/2-Math.sqrt(D));

         Koren K1 = new Koren((v+w-b/(3*a)));
         Koren K2 = new Koren((-(w+v)/2-b/(3*a)), (Math.sqrt(3)*((w-v))/2));
         Koren K3 = new Koren((-(w+v)/2-b/(3*a)), -(Math.sqrt(3)*((w-v))/2));

         return new Koren[]{K1,K2,K3};
     }
     else
         {
            double r = Math.sqrt(Math.pow(q,2)/4 + Math.abs(D));
            double fi =Math.atan((-2*Math.sqrt(Math.abs(D))/q));

             Koren K1 = new Koren((2*Math.cbrt(r)*Math.cos(fi/3))-b/(3*a));
             Koren K2 = new Koren((2*Math.cbrt(r)*Math.cos((fi+2*Math.PI)/3))-b/(3*a));
             Koren K3 = new Koren((2*Math.cbrt(r)*Math.cos((fi+4*Math.PI)/3))-b/(3*a));

             return new Koren[]{K1,K2,K3};
         }







        //vypočítame x1, x2, x3:




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
