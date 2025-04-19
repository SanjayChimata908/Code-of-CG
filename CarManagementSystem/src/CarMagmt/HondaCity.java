package CarMagmt;

public class HondaCity extends Car {

	private int mileage;
	
	public HondaCity(int mileage) {
		this.mileage = mileage;
	}

	public boolean getIsSedan() {
		
		return true;
	}

	public int getSeats() {
		
		return 4;
	}

	public String getMileage() {
		
		return mileage + "KMPL";
	}
	
}
