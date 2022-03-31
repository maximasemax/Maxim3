package model.hardware;

import model.Computer;
import model.PersonalComputer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ComputerCreator;

public class ComputerCreatorTest {


    @Test
    public void computerHyperPcTest() {
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerHiperpc = computerCreator.createHiperpc();
        Assertions.assertNotNull(computerHiperpc);
        Assertions.assertNotNull(computerHiperpc.getName());
        Assertions.assertNotNull(computerHiperpc.getRamConfiguration());
        Assertions.assertNotNull(computerHiperpc.getHddConfiguration());
        Assertions.assertNotNull(computerHiperpc.getCpu());
        Assertions.assertNotNull(computerHiperpc.getMotherboard());
        Assertions.assertNotNull(computerHiperpc.getVideoAdapter());

        Assertions.assertFalse(computerHiperpc.getRamConfiguration().getAllItems().contains(null));
        Assertions.assertFalse(computerHiperpc.getRamConfiguration().getAllItems().isEmpty());

        Assertions.assertFalse(computerHiperpc.getHddConfiguration().getAllItems().contains(null));
        Assertions.assertFalse(computerHiperpc.getHddConfiguration().getAllItems().isEmpty());


    }
}
