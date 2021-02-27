package lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        start(MyClass.class);
    }

    public static void start(Class<MyClass> myClass) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = myClass.getDeclaredMethods();
        int countBeforeSuite = 0;
        int countAfterSuite = 0;
        TreeSet <Integer> priorityIndex = new TreeSet<>();
        priorityIndex.add(0);

        for (Method method : methods) {

            if (method.isAnnotationPresent(BeforeSuite.class)) {
                method.setAccessible(true);
                countBeforeSuite++;
                if (countBeforeSuite == 1) {
                    method.invoke(myClass);
                } else {
                    throw new RuntimeException("Mетод с аннотацией BeforeSuite повторяется");
                }
            }
        }

        for (int i = 0; i < methods.length; i++){
            if (methods[i].isAnnotationPresent(Test.class)) {

                 priorityIndex.add(methods[i].getAnnotation(Test.class).priority());

            }
        }


        while (priorityIndex.iterator().hasNext()) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    if ((method.getAnnotation(Test.class).priority()) == priorityIndex.first()) {
                        method.setAccessible(true);
                        method.invoke(myClass);

                    }
                }
            }
            priorityIndex.remove(priorityIndex.first());
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                method.setAccessible(true);
                countAfterSuite++;
                if (countAfterSuite == 1) {
                    method.invoke(myClass);
                } else {
                    throw new RuntimeException("Mетод с аннотацией AfterSuite повторяется");
                }
            }
        }

    }

}
