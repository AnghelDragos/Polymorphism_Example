public class Main {
    public static void main (String[] args){

    Bmw bmwCar = new Bmw ("3 Series", 10);
    Mercedes mercedesCar = new Mercedes ("E Class", 15);
    Dacia daciaCar = new Dacia ("Logan", 20);

    bmwCar.reachMaxSpeed();
    mercedesCar.reachMaxSpeed();
    daciaCar.reachMaxSpeed();
    daciaCar.crushEngine();

    }


}
