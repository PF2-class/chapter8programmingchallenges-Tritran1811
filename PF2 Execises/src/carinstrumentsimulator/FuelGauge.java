package carinstrumentsimulator;

public class FuelGauge {
	private double currentFuel;

	public FuelGauge(double f){
		currentFuel=f;
	}


	public FuelGauge(FuelGauge cf) {
		
		this.currentFuel = cf.currentFuel;
	}


	public void fillFuel() {
		if(currentFuel<15) {
			currentFuel++;
		}
		else {
			System.out.println("The car is full of gas!!!");
		}
	}

	public void emptyFuel() {
		if(currentFuel>0) {
			currentFuel--;
			
		}
		else
			System.out.println("The car is empty of gas!!!");
	}




	public double getCurrentFuel() {
		return currentFuel;
	}
}
