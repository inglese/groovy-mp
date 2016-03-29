package email.englisch

import org.junit.Test

import static groovy.test.GroovyAssert.shouldFail

class PreventNullInitialisationTest {

    static class TestClass {
        final String nullableString

        TestClass(String nullableString) {
            Objects.requireNonNull(nullableString, 'string must not be null')
            this.nullableString = nullableString
        }
    }

    @Test
    void property_null_initialisation_should_fail() {
        shouldFail(NullPointerException) {
            //noinspection GroovyUnusedAssignment
            def testClass = new TestClass(null)
        }
    }
}
