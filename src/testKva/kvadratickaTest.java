package testKva;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import map.rovnica.kvadraticka;
class kvadratickaTest {


    kvadraticka k1;
    kvadraticka k2;
    kvadraticka k3;


    @BeforeEach
    void setUp()
    {
        k1=new kvadraticka(1,-5,6);
        k2=new kvadraticka(1,4,6);
        k3=new kvadraticka(1,4,4);


    }

    @Test
    void getKorene()
    {


    }
}