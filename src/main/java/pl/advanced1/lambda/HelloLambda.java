package pl.advanced1.lambda;

@FunctionalInterface
interface SayHallo {
    void sayHallo();
    default void sayGoodbye() {
        System.out.println("Goodbye!!!");
    }
}

@FunctionalInterface
interface Test {
    void testMethod(int age, String name);
    default void defaultMethod1() {
        System.out.println("default method1");
    }
    default void defaultMethod2() {
        System.out.println("default method2");
    }
}

public class HelloLambda {

    public static void main(String[] args) {
        SayHallo hello = () -> System.out.println("Hello World");
        hello.sayHallo();

        Test test1 = (a,b) -> System.out.println(b + " is " + a + " years old");
        test1.testMethod(23,"Ana");
        test1.defaultMethod1();

        Test test2 = (a,b) -> System.out.println(""+a+a+a + "------" +b+b+b);
        useTest(test2,45,"Bob");
    }

    static void useTest(Test test, int a, String s) {
        test.testMethod(a, s);
    }

}
