public class App {
    public static void main(String[] args) throws Exception {
        
        HybridVehicle car1 = new HybridSedan();
        car1.carname = "tesla model s";

        HybridVehicle car2 = new HybridPickup();
        car2.carname = "BYD Shark";


        System.out.print(car1.carname);
        car1.chargeBattery();
        car1.fillgas();

        System.out.print(car2.carname);
        car2.chargeBattery();
        car2.fillgas();


        Carwash cw = new Carwash();
        cw.wash(car1);
        cw.wash(car2);


        
    }
}
