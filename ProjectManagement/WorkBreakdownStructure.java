package ProjectManagement;

public class WorkBreakdownStructure {

	private String name;
	private ArrayList<String> theTasks;

	public String getName() {
		// TODO - implement WorkBreakdownStructure.getName
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getTheTasks() {

		// TODO - implement WorkBreakdownStructure.getTheTasks
		for(int i = 0; i < theTasks.size(); i++) {
			System.out.println("Task: " + theTasks.get(i));
		}
	}

	/**
	 * 
	 * @param theTasks
	 */
	public void setTheTasks(ArrayList<String> theTasks) {
		this.theTasks = theTasks;
	}

	public WorkBreakdownStructure() {
		// TODO - implement WorkBreakdownStructure.WorkBreakdownStructure
	}

}