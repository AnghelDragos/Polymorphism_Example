public class Bmw extends Car {

    public Bmw (String model, int maxSpeed){
        super (model, maxSpeed);

    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("The BMW car has reached max speed");
    }


    @Override
    public String toString() {
        return "Bmw{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
