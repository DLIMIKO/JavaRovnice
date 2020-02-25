package map.rovnica;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Koren
{

    private float realCast;
    private float komplCast;
    private boolean existuje;

    Koren(float rC, float kC)
    {
        realCast=rC;
        komplCast=kC;
        existuje=true;
    }
    Koren(float rC)
    {
        realCast=rC;
        komplCast=0;
        existuje=true;
    }
    Koren()
    {
       existuje=false;
    }

   //geters
    public float getRealCast()
    {
        try
        {
            if(!existuje)
            {
                throw new ArrayIndexOutOfBoundsException("Koreň neexistuje!");
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(1);

        }
        return realCast;
    }

    public float getKomplCast()
    {
        try
        {
            if(!existuje)
            {
                throw new ArrayIndexOutOfBoundsException("Koreň neexistuje!");
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(1);

        }
        return komplCast;
    }

    @Override
    public String toString()
    {

       if(!existuje)
       {
           return "nan";
       }
        else if (komplCast==0)
        {
            return String.valueOf(realCast);

        }

        else
            {
                return String.format("%.2f %+.2f i", realCast, komplCast);
            }

    }



}
