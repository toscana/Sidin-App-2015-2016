package be.ehb.iwt.sidinapp;

import android.os.AsyncTask;
import android.util.Log;

import org.restlet.resource.ClientResource;

import java.util.List;

import be.ehb.iwt.sidin.core.Event;
import be.ehb.iwt.sidin.core.EventList;
import be.ehb.iwt.sidin.core.IEventsResource;
import be.ehb.iwt.sidin.core.ISchoolsResource;
import be.ehb.iwt.sidin.core.School;
import be.ehb.iwt.sidin.core.SchoolList;
import be.ehb.iwt.sidinapp.restlet.EngineConfiguration;

public class GetSchoolsASyncTask extends AsyncTask<String, Void, List<School>> {

	private LoginActivity mLoginActivity;

	public GetSchoolsASyncTask(LoginActivity la) {
		super();
		this.mLoginActivity = la;
	}

	// first parameter is the URL with which to connect
	@Override
	protected List<School> doInBackground(String... arg0) {

		String url = arg0[0];

		EngineConfiguration.getInstance();
		ClientResource cr = new ClientResource("http://" + url + "/schools");
		Log.d("bert","url is " + "http://" + url + "/schools" );
		ISchoolsResource resource = cr.wrap(ISchoolsResource.class);

		try {
			// Get the remote contact
			SchoolList list = resource.retrieve();
			return list.getSchools();
		} catch (Exception e) {
			Log.d("bert", "ERROR DONLOAD SHOOL LIST");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected void onPostExecute(List<School> result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);

		mLoginActivity.putSchools(result);
	}

}
