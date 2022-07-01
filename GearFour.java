public class GearFour implements IGear {
    @Override
    public int changeSpeed(MyCar car, int speed) {
        if (speed > 54){
            car.setCurrentGear(new GearFive());
            return 5;
        } else if (speed < 30) {
            car.setCurrentGear(new GearThree());
            return 3;
        }
        return 4;
    }
}
