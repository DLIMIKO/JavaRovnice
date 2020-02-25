package map.rovnica;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class rovnica

{
    protected float a;
    protected float b;
    abstract protected void  vypisRovnicu();
    abstract protected Koren[] getKorene();
    abstract protected void vypisKorene();
    abstract public String toString();

    float getFloat(boolean ajNula, String text)
    {

       Scanner jin=new Scanner(System.in);
       float in=jin.nextFloat();

       try
        {

            if(!ajNula && in==0)
            {
               throw new ArithmeticException(text);
            }
        }
       catch(ArithmeticException Ex)
       {


           System.out.println(Ex.getMessage());
           System.exit(1);
       }
       catch(InputMismatchException e)
       {
           System.out.println("Nebolo zadane cislo");
           jin.nextLine();
       }
       return in;

    }



}
