package email.englisch

import groovy.transform.EqualsAndHashCode

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 * A matchday where matches can take place
 */
@EqualsAndHashCode(includes = 'date')
class Matchday {
    public static final def matchday = 'silent word'
    public static final def with = 'silent word'

    LocalDate date
    String description
    List matches = []

    static def create(matchday) {
        [on: { String dateString, with ->
                [description: { String description ->
                    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN)
                    new Matchday(date: LocalDate.parse(dateString, formatter), description: description)
            }]
        }]
    }

    void add(Match match) {
        matches.add(match)
    }
}
