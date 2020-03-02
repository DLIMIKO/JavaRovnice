package test_linearna;
import map.rovnica.Koren;
import map.rovnica.linearna;
import sun.jvm.hotspot.utilities.Assert;


import static org.junit.jupiter.api.Assertions.*;

class Test {


    private linearna Prva;


    @org.junit.jupiter.api.BeforeEach

    void setUp()
    {
        Prva=new linearna(9,2);
    }


    @org.junit.jupiter.api.Test
    void getKorene()
    {

    Koren K= new Koren(-1);
        assertEquals(Prva.getKorene()[0], K);


    }
}