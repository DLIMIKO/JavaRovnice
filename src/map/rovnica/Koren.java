package map.rovnica;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Koren
{

    private double realCast;
    private double komplCast;


    Koren(double rC, double kC)
    {
        realCast=rC;
        komplCast=kC;

    }
    Koren(double rC)
    {
        realCast=rC;
        komplCast=0;

    }


   //geters
    public double getRealCast()
    {
        return realCast;
    }

    public double getKomplCast()
    {
        return komplCast;
    }

    @Override
    public String toString()
    {

        if (komplCast==0)
        {
            return String.format("%.2f",realCast);
        }

        else
            {
                return String.format("%.2f %+.2f i", realCast, komplCast);
            }
    }

}
