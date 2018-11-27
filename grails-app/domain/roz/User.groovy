package roz

class User {
    String name
    String position
    String classification
    String major
    String college
    String subteam
    String email
    String slackUID

    static constraints = {
        name blank: false
        position blank: false, inList: ["General Member", "Director", "Officer", "Advisor"]
        classification blank: false
        major blank: false
        college blank: false
        subteam blank: false
        email blank: false, email: true
        slackUID blank: false
    }
}