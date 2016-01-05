package be.ehb.iwt.sidin.core;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface IEventResource {
	@Get
	public Event retrieve();
	
	@Post
	public void store(Event e);
	
	@Delete
	public void remove();

	
}
