package carinstrumentsimulator;

public class CarInstrumentSimulatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FuelGauge gauge = new FuelGauge(1);
	        for(int i = 0; i<=15; i++){
	            gauge.fillFuel();
	        }
	        System.out.println("Gallons in gauge: "+gauge.getCurrentFuel());
	        
	        Odometer odometer = new Odometer(999980, gauge);
	        while(odometer.getCurrentMileage() != 0){
	            odometer.odometerAdjust();
	            System.out.println("Mileage: "+odometer.getCurrentMileage()+
	                    "\tGallons: "+odometer.getFuelGauge());
	        }
	}

}
