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
       float in;


      while(true)
        {
            in=jin.nextFloat();
            try
            {

                if (!ajNula && in == 0)
                {
                    throw new ArithmeticException(text);
                }
                break;
            }
            catch (ArithmeticException Ex)
            {
                System.out.println(Ex.getMessage());

            }
            catch (InputMismatchException e)
            {
                jin.nextLine();
                System.out.println("Nebolo zadane cislo");


            }

        }
        return in;
    }

}