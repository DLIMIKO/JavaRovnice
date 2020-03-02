package map.rovnica;
import java.util.Scanner;



public class linearna extends rovnica
{

    private static  Scanner sc=new Scanner(System.in);
    public linearna()
    {

        System.out.println("Zadaj koeficienty a a b");
        this.a = getDouble(false, "Nula nie!");
        b= getDouble(true, "Nula nie");


    }

    public linearna(double A)
    {
        this(A,A);
    }

    public linearna(double A, double B)
    {
        try
        {
            if(A==0)
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
    }
    linearna(boolean koren, double K)
    {
        a=1;
        b=-K;
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx %+.2f=0\n", a,b);
    }

    @Override
    public Koren[] getKorene()
    {
       Koren K=new Koren(-b/a);

        return new Koren[]{K};
    }

    @Override
    protected void vypisKorene()
    {

        System.out.print("Koreň rovnice je:\n K= ");
        System.out.println(getKorene()[0]);


    }

    @Override
    public String toString()
    {
        return String.format("%.2fx%+.2f=0\n", a,b);
    }



}



