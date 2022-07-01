public class GearThree implements IGear{
    @Override
    public int changeSpeed(MyCar car, int speed) {

        if (speed > 29){
            car.setCurrentGear(new GearFour());
            return 4;
        } else if (speed < 10) {
            car.setCurrentGear(new GearTwo());
            return 2;

        }
        return 3;
    }
}
