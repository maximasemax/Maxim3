package model.hardware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HddConfigurationTest {

    @Test
    public void searchByNamePositiveTest() {
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddTest = new Hdd("hip", 123, 123);
        hddConfiguration.addHdd(hddTest);
        List<Hdd> hdds = hddConfiguration.getAllItems();
        Assertions.assertTrue(hdds.contains(hddTest));
    }

    @Test
    public void removeHddPositiveTest() {
        HddConfiguration hddConfiguration = new HddConfiguration();
        Hdd hddTest1 = new Hdd("hip", 123, 123);
        Hdd hddTest2 = new Hdd("pyp", 321, 321);
        hddConfiguration.addHdd(hddTest1);
        hddConfiguration.addHdd(hddTest2);
        hddConfiguration.removeHdd("hip");
        List<Hdd> hdds = hddConfiguration.getAllItems();
        Assertions.assertFalse(hdds.contains(hddTest1));
    }

    @Test
    public void editRamPositiveTest() {
        HddConfiguration hddConfigurationRealTest = new HddConfiguration();
        HddConfiguration hddConfigurationExpectedTest = new HddConfiguration();
        Hdd hddTest1 = new Hdd("hip", 123, 123);
        Hdd hddTest2 = new Hdd("pyp", 321, 321);
        hddConfigurationRealTest.addHdd(hddTest1);
        hddConfigurationExpectedTest.addHdd(hddTest2);
        hddConfigurationRealTest.editHdd("hip", 123, hddTest2);
        List<Hdd> hddsExpected = hddConfigurationExpectedTest.getAllItems();
        List<Hdd> hddsReal = hddConfigurationRealTest.getAllItems();
        Assertions.assertIterableEquals(hddsExpected, hddsReal);
    }
}