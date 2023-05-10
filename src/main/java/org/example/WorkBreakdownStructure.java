package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WorkBreakdownStructure {

	private static String name;
	private static ArrayList<String> theTasks;

	public static String getName() {
		// TODO - implement WorkBreakdownStructure.getName
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<String> getTheTasks() {

		// TODO - implement WorkBreakdownStructure.getTheTasks
		return theTasks;
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