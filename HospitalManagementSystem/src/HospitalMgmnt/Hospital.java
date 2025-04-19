package HospitalMgmnt;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Staff> StaffList;
	
	public Hospital() {
		StaffList = new ArrayList<>();
	}
	
	public void addStaff(Staff staff) {
		StaffList.add(staff);
	}
	
	public int getTotalStaffCount(){
		return StaffList.size();
	}
	
	public int getCountByType(Class<?> type) {
	        int count = 0;
	        for (Staff staff : StaffList) {
	            if (type.isInstance(staff)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public void displayStaffDetailsById(String id) {
	        for (Staff staff : StaffList) {
	            if (staff.getId().equals(id)) {
	                staff.search();
	                return;
	            }
	        }
	        System.out.println("Staff with ID " + id + " not found.");
	    }
	    
	 public static void main(String[] args) {
	    Hospital hospital = new Hospital();

	        // Adding doctors
	        hospital.addStaff(new Doctor("Dr. Smith", 45, "D001", "Cardiology", "Cardiologist", 500));
	        hospital.addStaff(new Doctor("Dr. Johnson", 50, "D002", "Neurology", "Neurologist", 600));

	        // Adding nurses
	        hospital.addStaff(new Nurse("Nurse Clara", 30, "N001", "Pediatrics", "Day", 25));
	        hospital.addStaff(new Nurse("Nurse James", 35, "N002", "ICU", "Night", 30));
	        
	        System.out.println("Total Staff Count: " + hospital.getTotalStaffCount());
	        System.out.println("Total Doctors: " + hospital.getCountByType(Doctor.class));
	        System.out.println("Total Nurses: " + hospital.getCountByType(Nurse.class));
	       
	        hospital.displayStaffDetailsById("D001");
	        hospital.displayStaffDetailsById("N002");
	        hospital.displayStaffDetailsById("X001"); // Non-existing ID
	    }
}
