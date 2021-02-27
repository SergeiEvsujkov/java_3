package lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class testClass = new Class();
        start(testClass);
    }

    public static void start(Class testClass) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = testClass.getClass().getDeclaredMethods();
        int countBeforeSuite = 0;
        int countAfterSuite = 0;

        for (Method method : methods) {

            if (method.isAnnotationPresent(BeforeSuite.class)) {
                method.setAccessible(true);
                countBeforeSuite++;
                if (countBeforeSuite == 1) {
                    method.invoke(testClass);
                } else {
                    throw new RuntimeException("Mетод с аннотацией BeforeSuite повторяется");
                }
            }
        }

        for (int i = 1; i < 11; i++) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    if ((method.getAnnotation(Test.class).priority()) == i) {
                        method.setAccessible(true);
                        method.invoke(testClass);
                    }
                }
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                method.setAccessible(true);
                countAfterSuite++;
                if (countAfterSuite == 1) {
                    method.invoke(testClass);
                } else {
                    throw new RuntimeException("Mетод с аннотацией AfterSuite повторяется");
                }
            }
        }

    }

}
