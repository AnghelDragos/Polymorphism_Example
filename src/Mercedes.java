public class Mercedes extends Car{
    public Mercedes (String model, int maxSpeed){
        super(model,maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("The Mercedes car has reached max speed");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
