package ProjectManagement;

public class Project {

	private String name;
	private String theResources;
	private ArrayList<String> theEmployees;
	private String theWorkBreakdownStructure;

	public void getName() {

		System.out.println("Project: " + name);
		// TODO - implement Project.getName

	}

	/**
	 * 
	 * @param name
	 */
	public void setName(int name) {
		this.name = name;
	}

	public void getTheResources() {
		// TODO - implement Project.getTheResources
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param theResources
	 */
	public void setTheResources(String theResources) {
		this.theResources = theResources;
	}

	public void getTheEmployees() {
		// TODO - implement Project.getTheEmployees
		for(int i = 0; i < theEmployees.size(); i++) {
			System.out.println("Employee: " + theEmployees.get(i));
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param theEmployees
	 */
	public void setTheEmployees(ArrayList<String>) {
		this.theEmployees = theEmployees;
	}

	public void getTheWorkBreakdownStructure() {
		// TODO - implement Project.getTheWorkBreakdownStructure
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param theWorkBreakdownStructure
	 */
	public void setTheWorkBreakdownStructure(String theWorkBreakdownStructure) {
		this.theWorkBreakdownStructure = theWorkBreakdownStructure;
	}

	public Project() {
		// TODO - implement Project.Project
		throw new UnsupportedOperationException();
	}

}