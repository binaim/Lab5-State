public class GearOne implements IGear{
    @Override
    public int changeSpeed(MyCar car, int speed) {
        if (speed >4){
            car.setCurrentGear(new GearTwo());
            return 2;
        } else if (speed < 1) {
            car.setCurrentGear(new Parking());
            return 0;

        }
        return 1;
    }
}
