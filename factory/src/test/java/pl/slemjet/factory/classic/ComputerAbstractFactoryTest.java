package pl.slemjet.factory.classic;

import org.junit.jupiter.api.Test;
import pl.slemjet.factory.classic.model.Computer;
import pl.slemjet.factory.classic.model.ComputerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ComputerAbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
        assertNotNull(pc);
        assertNotNull(server);
    }

}