package be.ehb.iwt.sidin.core;

import java.util.Comparator;

/**
 * Created by bert on 5/01/2016.
 */
public class SchoolComparator implements Comparator<School> {

    @Override
    public int compare(School school, School t1) {
        return school.getName().compareTo(t1.getName());
    }


}
