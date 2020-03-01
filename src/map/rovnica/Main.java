package map.rovnica;

public class Main
{
    public static void main(String[] args)
    {
       /* int S = 47;
        int M = 987;
        S=change(M, S=M);
        System.out.print(S);
        System.out.print(M);
        */



    Koren K1=new Koren(1,2);
    Koren K2=new Koren(1,-2);


       linearna lin=new linearna(true,6);
       kvadraticka kva=new kvadraticka(K1,K2);
       kubicka kub=new kubicka( 4,K1,K2);




kva.vypisRovnicu();
kva.vypisKorene();








    }
        static int change(int c, int d)
        {
            return c;
        }


}

