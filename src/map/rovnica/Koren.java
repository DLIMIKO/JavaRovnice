package map.rovnica;


import java.util.Objects;

public class Koren
{

    private double realCast;
    private double komplCast;


    public Koren(double rC, double kC)
    {
        realCast=rC;
        komplCast=kC;

    }
    public Koren(double rC)
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


    @Override
    public boolean equals(Object o)
     {

        if (o == this) return true;

        if (!(o instanceof Koren)) {
            return false;
        }

        return this.realCast==((Koren) o).realCast && this.komplCast==((Koren) o).komplCast;
    }




}

