public class Dacia extends Car {
    public Dacia(String model, int maxSpeed){
        super(model,maxSpeed);
    }


    @Override
    public void reachMaxSpeed() {
        System.out.println("The Dacia car has reached max speed");
    }


    public void crushEngine(){
        System.out.println("The Dacia engine has been crushed");
    }

    @Override
    public String toString() {
        return "Dacia{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
