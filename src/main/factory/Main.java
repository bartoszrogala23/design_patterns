package factory;

import factory.units.Factory;
import factory.units.UnitFactory;
import factory.units.UnitType;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        factory.createUnit(UnitType.RIFLEMAN);
        factory.createUnit(UnitType.TANK);
    }
}
