public class Parking implements IGear{

    public Parking() {
    }

    @Override
    public int changeSpeed(MyCar car, int speed) {
        if (speed > 0) {
            car.setCurrentGear(new GearOne());
            return 1;
        }

        return 0;
    }
}
