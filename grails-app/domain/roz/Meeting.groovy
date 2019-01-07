package roz

import java.sql.Time

class Meeting {
    String meetingUID
    String friendlyName
    String type
    Time startTime //does this have a start day? Is it just based of a time epoch?
    Time endTime
    String meetingOwnerUID //who can grant exceptions if required?
    String[] allowedPeople //blank means everyone allowed

    static constraints = {
        meetingUID blank: false
        friendlyName blank : false
        type blank : false
        startTime blank : false
        endTime blank : false
        meetingOwnerUID blank : false
        allowedPeople blank : false
    }
}
