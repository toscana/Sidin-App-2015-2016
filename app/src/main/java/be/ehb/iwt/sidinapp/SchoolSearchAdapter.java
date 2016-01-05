package be.ehb.iwt.sidinapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import be.ehb.iwt.sidin.core.School;
import be.ehb.iwt.sidin.core.Subscription;

public class SchoolSearchAdapter extends ArrayAdapter<String> {

	private List<School> lijst;

	public SchoolSearchAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		// TODO Auto-generated constructor stub
		lijst = new ArrayList<School>();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lijst.size();
	}

	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return lijst.get(position).getName();
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		SchoolViewHolder holder;

		if (convertView == null) {
			LayoutInflater li = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.school_search_layout,
					parent, false);

			holder = new SchoolViewHolder();
			holder.schoolNameField = (TextView) convertView
					.findViewById(R.id.textViewSearchFieldSchoolName);
			holder.cityNameField = (TextView) convertView
					.findViewById(R.id.textViewSearchFieldSchoolCity);
			convertView.setTag(holder);

		} else {
			holder = (SchoolViewHolder) convertView.getTag();
		}

		holder.schoolNameField.setText(lijst.get(position).getName());
		holder.cityNameField.setText(lijst.get(position).getCity());

		return convertView;

	}

	static class SchoolViewHolder {
		TextView schoolNameField;
		TextView cityNameField;
	}

	public School getSubscriptionAt(int selectedItemPosition) {
		// TODO Auto-generated method stub
		return lijst.get(selectedItemPosition);
	}

	public void setList(List<School> subList) {
		this.lijst = subList;
		this.notifyDataSetChanged();
		
	}

}
