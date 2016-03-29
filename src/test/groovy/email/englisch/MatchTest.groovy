package email.englisch

import org.junit.Test

import java.time.LocalTime

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.is

class MatchTest {
    @Test
    void test_match_creation() {
        def match = new Match(
                ageGroup: AgeGroup.wJB,
                league: League.OL,
                time: LocalTime.of(12, 0),
                homeTeam: 'SSV Ulm 1846',
                awayTeam: 'HTC Stuttgarter Kickers',
                homeMatch: true)

        assertThat(match.time, is(equalTo(LocalTime.of(12, 0))))
        assertThat(match.ageGroup, is(equalTo(AgeGroup.wJB)))
        assertThat(match.league, is(equalTo(League.OL)))
        assertThat(match.homeTeam, is(equalTo('SSV Ulm 1846')))
        assertThat(match.awayTeam, is(equalTo('HTC Stuttgarter Kickers')))
        assertThat(match.homeMatch, is(true))
    }
}
