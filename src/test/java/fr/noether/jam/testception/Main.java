package fr.noether.jam.testception;

public class Main {

    public static void main(String[] args) {
        var testFramework = new TestCaseTest(TestCaseTest::testMethodShouldBeRun);
        testFramework.run();
    }

}
