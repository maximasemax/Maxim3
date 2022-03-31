package model.hardware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RamTest {
    @Test
    public void constructorTest(){
        Ram ramTest = new Ram("testRam", 6090, 8128);
        Assertions.assertEquals("testRam", ramTest.getName());
        Assertions.assertEquals(6090, ramTest.getFrequency());

    }

}
