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



       linearna lin=new linearna(true,6);
       kvadraticka kva=new kvadraticka(false, 1,2);
       kubicka kub=new kubicka(true,-7.765,-9.075,-111);




kub.vypisRovnicu();
kub.vypisKorene();








    }
        static int change(int c, int d)
        {
            return c;
        }


}

