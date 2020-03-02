package map.rovnica;

public class Main
{
    public static void main(String[] args)
    {
        linearna lin=new linearna(1,2);
        kvadraticka kva=new kvadraticka(1,5,7);
        kubicka kub=new kubicka(2,-4,-22,24);

        Koren K1=new Koren(1,+2);
        Koren K2=new Koren(1,-2);
        kvadraticka kva2=new kvadraticka(K1,K2);

        kub.vypisKorene();


       //návod na riešenie kub. rovníc https://www.mathemania.com/lesson/cardanos-formula-solving-cubic-equations/
        //online riešiteľ kub. rovníc http://www.1728.org/cubic.htm
    }
}

