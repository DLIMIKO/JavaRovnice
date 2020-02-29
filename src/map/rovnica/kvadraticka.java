package map.rovnica;

public class kvadraticka extends rovnica

{

    private double c;

    kvadraticka()
    {
        a= getDouble(false,"Nula nie");
        b= getDouble(true,"Nula nie");
        c= getDouble(true,"Nula nie");
    }
    kvadraticka(double A, double B, double C)
    {

        try
        {
            if(A==0 && B==0)
            {
                throw new ArithmeticException("Toto nie je platná rovnica!");
            }
        }
        catch(ArithmeticException AE)
        {
            System.out.print(AE.getMessage());
            System.exit(1);
        }
        a=A;
        b=B;
        c=C;
    }

    kvadraticka(double A){this(A,A,A);}



    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^2 %+.2fx %+.2f=0\n",a,b,c);
    }

    @Override
    protected Koren[] getKorene()
    {
       double D=Math.pow(b,2)-4*a*c;

       if (a==0)
       {
           Koren K=new Koren(-c/b);
           return new Koren[] {K};
       }
       else if(D>0)
       {
           Koren K1=new Koren((-b+Math.sqrt(D))/(2*a));
           Koren K2=new Koren((-b-Math.sqrt(D))/(2*a));
           return new Koren[]{K1, K2};
       }
       else if(D==0)
        {
            Koren K=new Koren((-b)/(2*a));


            return new Koren[]{K,K};
        }
       else
           {
               Koren K1=new Koren( ((-b)/(2*a)),((+Math.sqrt(Math.abs(D)))/(2*a)));
               Koren K2=new Koren( ((-b)/(2*a)),((-Math.sqrt(Math.abs(D)))/(2*a)));
               return new Koren[]{K1,K2};
           }
    }

    @Override
    protected void vypisKorene()
    {
        double D=Math.pow(b,2)-4*a*c;


        if(a==0)
        {
            System.out.print("Koreň rovnice je:\n K= ");
            System.out.println(getKorene()[0]);
        }
        else if(D>0)
        {
            System.out.print("Korene rovnice sú:\n K1= ");
            System.out.println(getKorene()[0]);
            System.out.print(" K2= ");
            System.out.println(getKorene()[1]);

        }
        else if(D==0)
        {
           System.out.print("Koreň rovnice je:\n K= ");
           System.out.println(getKorene()[0]);


        }
        else
            {
                System.out.print("Korene rovnice sú:\n K1= ");
                System.out.println(getKorene()[0]);
                System.out.print(" K2= ");
                System.out.println(getKorene()[1]);

            }


    }

    @Override
    public String toString()
    {
        return String.format("%.2fx^2 %+.2fx %+.2f",a,b,c);
    }
}
