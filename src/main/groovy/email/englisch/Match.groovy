package email.englisch

import java.time.LocalTime

/**
 * A match between two teams
 */
class Match {
    AgeGroup ageGroup
    League league
    LocalTime time
    String homeTeam
    String awayTeam
    Boolean homeMatch
}
