package email.englisch

import org.junit.Test

import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.greaterThan
import static org.hamcrest.Matchers.is
import static org.junit.Assert.assertThat

class TestEnumEqualityAndComparability {

    enum Priority {
        Low, Medium, High
    }

    @Test
    void test_equality() {
        def basePriority = Priority.Medium
        def samePriority = Priority.Medium

        assertThat(samePriority, is(equalTo(basePriority)))
    }

    @Test
    void test_comparability() {
        def lowPriority = Priority.Low
        def highPriority = Priority.High

        assertThat(highPriority, is(greaterThan(lowPriority)))
    }
}
