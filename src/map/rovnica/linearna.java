package map.rovnica;
import java.util.Scanner;



public class linearna extends rovnica
{
    private float koren;
    private static  Scanner sc=new Scanner(System.in);
    public linearna()
    {

        System.out.println("Zadaj koeficienty a a b");
        a=getFloat(false, "Nula nie!");
        b=getFloat(true, "Nula nie");


    }

    public linearna(float A)
    {
        this(A,A);
    }

    public linearna(float A, float B)
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

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx %+.2f=0\n", a,b);
    }

    @Override
    protected Koren[] getKorene()
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



