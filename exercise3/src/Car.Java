public class Car {
    public static void main(String[] args) throws Exception {

        Hybrid vehicle = new Electric();
        vehicle1.vehiclename = "Charge battery";

        Hybrid vehicle= new Internalcombustion();
        vehicle2.vehiclename = "Fillgas";

      
        ArrayList<vehiclefunction> vehicles = new ArrayList<>();
        vehicle.add(vehicle1);
        vehicle.add(vehicle2);
        
        for (Hybrid vehicle : vehicles) 
            vehicle.vehiclename();
        }

    }
}