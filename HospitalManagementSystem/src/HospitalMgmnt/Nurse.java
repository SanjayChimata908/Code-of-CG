package HospitalMgmnt;

public class Nurse extends Staff{
	
	 private String shiftTimings;
	 private double hourlyWage;

	 public Nurse(String name, int age, String id, String department, String shiftTimings, double hourlyWage) {
	        super(name, age, id, department);
	        this.shiftTimings = shiftTimings;
	        this.hourlyWage = hourlyWage;
	    }

	@Override
	public void search() {
		    System.out.println("Nurse Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("ID: " + id);
	        System.out.println("Department: " + department);
	        System.out.println("Shift Timings: " + shiftTimings);
	        System.out.println("Hourly Wage: " + hourlyWage);
		
	}
	 

}
