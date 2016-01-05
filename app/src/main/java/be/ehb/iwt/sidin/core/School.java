package be.ehb.iwt.sidin.core;


import java.io.Serializable;


public class School implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6113317881903371549L;
	
	private Long id;
	private int numberInstitution;
	private String name;
	private String city;
	private String street;
	private String streetnumber;
	private int zip;
	
	
	public School() {
		super();
	}
	
	
	public int getNumberInstitution() {
		return numberInstitution;
	}


	public void setNumberInstitution(int numberInstitution) {
		this.numberInstitution = numberInstitution;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getStreetnumber() {
		return streetnumber;
	}


	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public School(int numberInstitution, String name, String city,
			String street, String streetnumber, int zip) {
		super();
		this.numberInstitution = numberInstitution;
		this.name = name;
		this.city = city;
		this.street = street;
		this.streetnumber = streetnumber;
		this.zip = zip;
	}




	public School(Long id, int numberInstitution, String name, String city,
			String street, String streetnumber, int zip) {
		super();
		this.id = id;
		this.numberInstitution = numberInstitution;
		this.name = name;
		this.city = city;
		this.street = street;
		this.streetnumber = streetnumber;
		this.zip = zip;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
