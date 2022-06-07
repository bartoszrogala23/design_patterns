package factory.units;

public class UnitFactory extends Factory{
    public Unit createUnit(UnitType unitType) {

        switch (unitType){
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(75, 0, 10);
            default:
                throw new UnsupportedOperationException("no such type");
        }
    }
}
