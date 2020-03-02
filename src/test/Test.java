package test;
import map.rovnica.linearna;
import map.rovnica.Koren;

import static org.junit.jupiter.api.Assertions.*;

class Test {


private linearna Prva;
private linearna Druha;
private linearna Tretia;




  @org.junit.jupiter.api.BeforeEach
  void setUp()
  {
  Prva=new linearna(1,1);
  Druha=new linearna(-3,5);
  Tretia=new linearna(0,3);
  }
    @org.junit.jupiter.api.Test
    void getKorene()
    {
      assertEquals(Prva.getKorene()[0], -1);
      assertEquals(Druha.getKorene()[0],2);
      assertNull(Tretia.getKorene());

    }
}