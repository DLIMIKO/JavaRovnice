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

    public linearna(float A){this(A,A);}
    public linearna(float A, float B) {a=A; b=B;}

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx%+.2f=0\n", a,b);
    }

    @Override
    protected float[] getKorene()
    {
        return new float[]{-b/a};
    }

    @Override
    protected void vypisKorene()
    {
     System.out.printf("Koreň rovnice je: %.2f\n", getKorene()[0]);
    }

    @Override
    public String toString()
    {
        return String.format("%.2fx%+.2f=0\n", a,b);
    }


}



