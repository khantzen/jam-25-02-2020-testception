package fr.noether.jam.testception;

import java.util.function.Consumer;

public class TestCaseTest extends TestCase {

    public TestCaseTest(Consumer<TestCaseTest> testMethod) {
        super(testMethod);
    }

    public void testMethodShouldBeRun() {
        var myTest = new TestClass(TestClass::testMethod);

        myTest.assertNotCalled();
        myTest.run();
        myTest.assertCalled();

        System.out.println("Test Pass");
    }

}
