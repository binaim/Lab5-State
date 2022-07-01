public class GearFive implements IGear{
    @Override
    public int changeSpeed(MyCar car, int speed) {
        if (speed > 55){
            car.setCurrentGear(this);
            return 5;
        }
        return 4;
    }
}
