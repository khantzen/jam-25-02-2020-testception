package fr.noether.jam.testception;

import java.util.function.Consumer;

public class TestCase {
    protected Consumer testMethod;

    public TestCase(Consumer<? extends TestCase> testMethod) {
        this.testMethod = testMethod;
    }

    public void run() {
        testMethod.accept(this);
    }
}
