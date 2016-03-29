package email.englisch

import groovy.transform.Immutable
import org.junit.Test

import static groovy.test.GroovyAssert.shouldFail
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.contains
import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.is

class ImmutableClassCharacteristicsTest {
    @Immutable
    static class ImmutableClass {
        String string
        List items
    }

    @Test
    void test_immutable_class_properties() {
        def immutableClass = new ImmutableClass('immutableClass', ['item1', 'item2'])

        assertThat(immutableClass.string, is(equalTo('immutableClass')))
        assertThat(immutableClass.items, contains('item1', 'item2'))
        shouldFail(ReadOnlyPropertyException) {
            //noinspection GrFinalVariableAccess
            immutableClass.string = 'not immutable'
        }
        shouldFail(UnsupportedOperationException) {
            immutableClass.items.add('item3')
        }
    }
}
