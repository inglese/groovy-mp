package email.englisch

import org.junit.Test

class NonNullableTest {
    static class TestClass implements GroovyInterceptable {
        String nullable
        String nonNullable

        void method(String arg) {}

        Object getProperty(String propertyName) {
            println "Getting '$propertyName'"
            return metaClass.getProperty(this, propertyName)
        }

        void setProperty(String propertyName, Object newValue) {
            println "Setting '$propertyName' to '$newValue'"
            metaClass.setProperty(this, propertyName, newValue)
        }

/*        Object invokeMethod(String name, Object args) {
            println "invoking '$name' with args '$args'"
            def method = metaClass.getMetaMethod(name, args)
            method(args)
        }*/
    }

    @Test
    void test_testClass_Mop() {
        TestClass testClass = new TestClass(nullable: 'nullable', nonNullable: 'not nullable')
        testClass.nullable = null
        testClass.nonNullable = null
        testClass.method('arg')
    }
}
