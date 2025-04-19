package CarMagmt;

public class WagonR extends Car{
	private int mileage;

	public WagonR(int mileage) {
        this.mileage = mileage;
    }

	public boolean getIsSedan() {
		
		return false;
	}

	public int getSeats() {
		return 4;
	}

	public String getMileage() {
		return mileage +"KMPL";
	}

}
