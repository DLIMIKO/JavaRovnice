package map.rovnica;


public class Koren
{

    private double realCast;
    private double komplCast;


    /**
     * Konštruktor inicializuje reálnu a imaginárnu časť komplexného čísla.
     * @param rC <reálna časť>
     * @param kC <imaginárna časť>
     */

    public Koren(double rC, double kC)
    {
        realCast=rC;
        komplCast=kC;
    }

    /**
     * Konštruktor inicializuje iba reálnu časť komplexného čísla.
     * Imaginárna časť sa implicitne nastaví na 0.
     * @param rC <reálna časť>
     */

    public Koren(double rC)
    {
        realCast=rC;
        komplCast=0;

    }

    /**
     * Funkcia vráti reálnu časť komplexného čísla
     * @return <vráti >
     */


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

        if (!(o instanceof Koren))
        {
            return false;
        }

        return this.realCast==((Koren) o).realCast && this.komplCast==((Koren) o).komplCast;
    }

}

