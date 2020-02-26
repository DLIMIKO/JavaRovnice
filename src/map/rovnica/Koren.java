package map.rovnica;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Koren
{

    private float realCast;
    private float komplCast;


    Koren(float rC, float kC)
    {
        realCast=rC;
        komplCast=kC;

    }
    Koren(float rC)
    {
        realCast=rC;
        komplCast=0;

    }


   //geters
    public float getRealCast()
    {
        return realCast;
    }

    public float getKomplCast()
    {
        return komplCast;
    }

    @Override
    public String toString()
    {


        if (komplCast==0)
        {
            return String.valueOf(realCast);

        }

        else
            {
                return String.format("%.2f %+.2f i", realCast, komplCast);
            }

    }



}
