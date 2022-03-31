package model.hardware;

import model.Computer;
import model.PersonalComputer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ComputerCreator;

public class ComputerCreatorTest {


    @Test
    public void ComputerHyperPcTest(){
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerHiperpc = computerCreator.createHiperpc();
        Assertions.assertNotNull(computerHiperpc);
        Assertions.assertNotNull(computerHiperpc.getName());
        Assertions.assertNotNull(computerHiperpc.getRamConfiguration());
        Assertions.assertNotNull(computerHiperpc.getHddConfiguration());
        Assertions.assertNotNull(computerHiperpc.getCpu());
        Assertions.assertNotNull(computerHiperpc.getMotherboard());
        Assertions.assertNotNull(computerHiperpc.getVideoAdapter());
        Ram ramNull = null;
        Assertions.assertFalse(computerHiperpc.getRamConfiguration().getAllItems().contains(ramNull));






    }
}
