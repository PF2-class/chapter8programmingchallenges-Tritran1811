package carinstrumentsimulator;

public class Odometer {
	private double currentMileage;
	private FuelGauge fuelgauge;


	public Odometer(double cm, FuelGauge fg) {
		this.currentMileage=cm;
		this.fuelgauge= new FuelGauge(fg);
		
	}


	public double getCurrentMileage() {
		return currentMileage;
	}


	public double getFuelGauge() {
		
		double fuel = fuelgauge.getCurrentFuel();
		return fuel;
	}


	public void odometerAdjust() {
		if(currentMileage==999999) {
			currentMileage=0;
		}
		else {
			currentMileage++;
		}
		if(currentMileage%24==0) {
			fuelgauge.emptyFuel();
		}
		
	}
}
