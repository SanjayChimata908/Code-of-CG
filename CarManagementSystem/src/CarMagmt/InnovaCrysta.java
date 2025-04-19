package CarMagmt;

public class InnovaCrysta extends Car{

	private int mileage;
	
	public InnovaCrysta(int mileage) {
		this.mileage = mileage;
	}
	
	public boolean getIsSedan() {
		return false;
	}

	public int getSeats() {
		return 6;
	}

	public String getMileage() {
		return mileage + "KMPL";
	}

}
