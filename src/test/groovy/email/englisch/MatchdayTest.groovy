package email.englisch

import org.junit.Test

import java.time.LocalDate

import static email.englisch.AgeGroup.wJB
import static email.englisch.League.OL
import static email.englisch.Matchday.*
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

class MatchdayTest {
    @Test
    void test_equality_functionality() {
        def today = LocalDate.now()
        def baseMatchday = new Matchday(date: today, description: 'baseMatchday')
        def sameMatchday = new Matchday(date:today, description: 'sameMatchday')

        assertThat(sameMatchday, is(equalTo(baseMatchday)))
    }

    @Test
    void test_creation_dsl() {
        Matchday actualMatchday = create matchday on '05.05.2016', with description 'Christi Himmelfahrt'
        LocalDate expectedDate = LocalDate.of(2016, 5, 5)

        assertThat(actualMatchday.date, is(equalTo(expectedDate)))
        assertThat(actualMatchday.description, is(equalTo('Christi Himmelfahrt')))
    }

    @Test
    void test_adding_matches() {
        Matchday matchday = new Matchday(date: LocalDate.now(), description: 'matchday')
        Match match = new Match(ageGroup: wJB, league: OL, time: null,
                homeTeam: 'SSV Ulm 1846', awayTeam: 'HTC Stuttgarter Kickers',
                homeMatch: true)

        matchday.add(match)

        assertThat(matchday.matches, contains(match))
    }
}

