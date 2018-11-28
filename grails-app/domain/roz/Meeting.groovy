package roz

import java.sql.Time

class Meeting {
    String meetingUID
    String friendlyName
    Time startTime //does this have a start day? Is it just based of a time epoch?
    String meetingOwnerUID //who can grant exceptions if required?
    String[] allowedPeople //blank means everyone allowed?
    boolean isRequired

    static constraints = {
    }
}
