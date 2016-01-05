package be.ehb.iwt.sidin.core;

import org.restlet.resource.Get;


public interface ISchoolsResource {
	@Get
	public SchoolList retrieve();

}
