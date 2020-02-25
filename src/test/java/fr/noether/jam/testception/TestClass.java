package fr.noether.jam.testception;

import java.util.function.Consumer;

public class TestClass extends TestCase {
    private boolean wasCall;

    public TestClass(Consumer<TestClass> testMethod) {
        super(testMethod);
    }

    public void assertCalled() {
        var expectedCall = true;
        var actualCall = this.wasTestMethodCall();
        if (actualCall != expectedCall) {
            throw new RuntimeException("Expected test method to have been run");
        }
    }

    public void assertNotCalled() {
        var expectedCall = false;
        var actualCall = this.wasTestMethodCall();

        if (actualCall != expectedCall) {
            throw new RuntimeException("Expected test method to not have been run");
        }
    }

    public boolean wasTestMethodCall() {
        return wasCall;
    }

    public void testMethod() {
        wasCall = true;
    }


}
