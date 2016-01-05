package be.ehb.iwt.sidin.core;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface ISchoolResource {
	@Get
	public School retrieve();
	
	@Post
	public void store(School t);
	
	@Delete
	public void remove();
}
