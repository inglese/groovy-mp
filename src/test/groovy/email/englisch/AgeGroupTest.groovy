package email.englisch

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

import static AgeGroup.*

class AgeGroupTest {
    @Test
    void test_correct_creation() {
        def ageGroup = wJB
    }

    @Test
    void test_correct_ordering() {
        def baseAgeGroup = wJB
        def greaterAgeGroup = wJA

        assertThat(greaterAgeGroup, is(greaterThan(baseAgeGroup)))
    }

    @Test
    void test_equality_functionality() {
        def baseAgeGroup = wJB
        def sameAgeGroup = wJB

        assertThat(sameAgeGroup, is(equalTo(baseAgeGroup)))
    }

    @Test
    void test_completeness_and_correctness() {
        def ageGroups = [Herren, Damen, mJA, wJA, mJB, wJB, KA, MA, KB, MB, KC, MC, KD, MD]
        for (i in 0..ageGroups.size()-2) {
            assertThat(ageGroups[i], is(greaterThan(ageGroups[i+1])))
        }
    }
}
