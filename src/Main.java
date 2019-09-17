public class Main {

    public static void main(String[] args) {

        double fuelСonsumption = 7.5;
        double volumeOfFuel = 67.0;
        double distance = (int) Math.round(volumeOfFuel / fuelСonsumption);

        System.out.println(distance);
    }
}
