public class MyCar {
    IGear CurrentState;


    public MyCar() {
        this.CurrentState = new Parking() ;
    }

    public void setCurrentGear(IGear CurrentState) {
        this.CurrentState = CurrentState;
    }

    public int changeSpeed(int speed){
       return CurrentState.changeSpeed(this, speed);
    }
}
