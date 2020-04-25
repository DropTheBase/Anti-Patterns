import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxistaTests {


    @Test
    public void test1(){
        Taxista taxista = new Taxista("Manel", 25,"Mercedes");
        taxista.setName("Renato");
        assertEquals("Renato", taxista.getName());

    }


    @Test
    public void test2(){
        Taxista taxista = new Taxista("Manel", 25,"Mercedes");
        taxista.setAge(30);
        assertEquals((Integer)30, taxista.getAge());
    }


    @Test
    public void testName_Car(){
        Taxista taxista = new Taxista("Manel", 25,"Mercedes");
        taxista.setName_car("Mercedes");
        assertEquals("Mercedes", taxista.getName_car());
    }
}
