package map.rovnica;

public class kvadraticka extends rovnica

{

    private float c;
    kvadraticka()
    {
        a=getFloat(false,"Nula nie");
        b=getFloat(true,"Nula nie");
        c=getFloat(true,"Nula nie");
    }
    kvadraticka(float A, float B, float C) {a=A; b=B; c=C;}
    kvadraticka(float A){this(A,A,A);}



    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^2 %+.2fx %+.2f",a,b,c);
    }

    @Override
    protected float[] getKorene()
    {
       float D=(float)Math.pow(b,2)-4*a*c;



        return new float[0];
    }

    @Override
    protected void vypisKorene() {

    }

    @Override
    public String toString() {
        return null;
    }
}
