package pl.slemjet.factory.classic.model;

import pl.slemjet.factory.classic.ComputerAbstractFactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
