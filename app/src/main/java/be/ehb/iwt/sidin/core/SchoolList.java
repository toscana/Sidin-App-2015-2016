package be.ehb.iwt.sidin.core;

import java.io.Serializable;
import java.util.List;

public class SchoolList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5517300947491552916L;
	private List<School> schools;

	public SchoolList() {
		super();
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

}
