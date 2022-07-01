public class GearTwo implements IGear{
    @Override
    public int changeSpeed(MyCar car, int speed) {

        if (speed > 9){
            car.setCurrentGear(new GearThree());
            return 3;
        } else if (speed < 5) {
            car.setCurrentGear(new GearOne());
            return 1;
        }
        return 2;
    }
}
