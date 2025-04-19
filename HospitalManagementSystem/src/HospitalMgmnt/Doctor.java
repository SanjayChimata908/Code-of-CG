package HospitalMgmnt;

public class Doctor extends Staff{

	private String specialization;
    private double consultationFee;

    public Doctor(String name, int age, String id, String department, String specialization, double consultationFee) {
        super(name, age, id, department);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

	public void search() {
		    System.out.println("Doctor Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("ID: " + id);
	        System.out.println("Department: " + department);
	        System.out.println("Specialization: " + specialization);
	        System.out.println("Consultation Fee: " + consultationFee);
		
	}

}
