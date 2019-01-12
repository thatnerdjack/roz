package roz

import java.sql.Time

class AttendanceRecord {
    String attendeeUID
    Time inTime
    String meetingUID

    static constraints = {
        attendeeUID blank: false
        inTime blank: false
        meetingUID blank: false
    }
}
