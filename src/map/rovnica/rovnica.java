package map.rovnica;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class rovnica

{
    protected double a;
    protected double b;
    abstract protected void  vypisRovnicu();
    abstract protected Koren[] getKorene();
    abstract protected void vypisKorene();
    abstract public String toString();


    double getDouble(boolean ajNula, String text)
    {

       Scanner jin=new Scanner(System.in);
       double in;


      while(true)
        {
            in=jin.nextDouble();
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