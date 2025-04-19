package HospitalMgmnt;

abstract class Staff {

	 protected String name;
	 protected int age;
	 protected String id;
	 protected String department;
	 
	 public Staff(String name, int age, String id, String department) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	        this.department = department;
	    }

	    public abstract void search();

	    public String getId() {
	        return id;
	    }
}
