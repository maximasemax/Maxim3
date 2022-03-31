package model.hardware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.accessibility.Accessible;
import java.util.List;

public class RamConfigurationTest {
    @Test
    public void searchByNamePositiveTest() {
        RamConfiguration ramConfigurationTest = new RamConfiguration();
        Ram ramTest = new Ram("hip", 123, 123);
        ramConfigurationTest.addRam(ramTest);
        List<Ram> rams = ramConfigurationTest.getAllItems();
        Assertions.assertTrue(rams.contains(ramTest));
    }

    @Test
    public void removeRamPositiveTest() {
        RamConfiguration ramConfiguration = new RamConfiguration();
        Ram ramTest1 = new Ram("hip", 123, 123);
        Ram ramTest2 = new Ram("pyp", 321, 321);
        ramConfiguration.addRam(ramTest1);
        ramConfiguration.addRam(ramTest2);
        ramConfiguration.removeRam("hip");
        List<Ram> rams = ramConfiguration.getAllItems();
        Assertions.assertFalse(rams.contains(ramTest1));
    }

    @Test
    public void editRamPositiveTest() {
        RamConfiguration ramConfigurationRealTest = new RamConfiguration();
        RamConfiguration ramConfigurationExpectedTest = new RamConfiguration();
        Ram ramTest1 = new Ram("hip", 123, 123);
        Ram ramTest2 = new Ram("pyp", 321, 321);
        ramConfigurationRealTest.addRam(ramTest1);
        ramConfigurationExpectedTest.addRam(ramTest2);
        ramConfigurationRealTest.editRam("hip", 123, ramTest2);
        List<Ram> ramsExpected = ramConfigurationExpectedTest.getAllItems();
        List<Ram> ramsReal = ramConfigurationRealTest.getAllItems();
        Assertions.assertIterableEquals(ramsExpected, ramsReal);
    }

}

