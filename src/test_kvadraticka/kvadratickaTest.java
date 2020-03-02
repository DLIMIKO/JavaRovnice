package test_kvadraticka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import map.rovnica.kvadraticka;
import map.rovnica.Koren;
class kvadratickaTest {


    private kvadraticka Prva;



    @BeforeEach
    void setUp()
    {
        Prva=new kvadraticka(1,-2,5);
    }

    @Test
    void getKorene()
    {

       Koren []Pole={new Koren(1,+2), new Koren(1,-2)};
       assertArrayEquals(Prva.getKorene(),Pole);



    }
}