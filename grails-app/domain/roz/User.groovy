package roz

class User {
    String name
    String position
    String year
    String major
    String college
    String subteam
    String email
    String slackUID
    String inClub

    static constraints = {
        name blank: false
        position blank: false, inList: ["General Member", "Director", "Officer", "Advisor"]
        year blank: false
        year blank: false
        major blank: false
        college blank: false
        subteam blank: false
        email blank: false, email: true
        slackUID blank: false
        inClub blank : false
    }
}
