package lesson7;

public class Class {

    public Class() {
    }

    @BeforeSuite
    private static void beforeSuite(){
        System.out.println("Начало тестирования");
    }

    @AfterSuite
    private static void afterSuite(){
        System.out.println("Конец тестирования");
    }

    @Test(priority = 1)
    private static void test1(){
        System.out.println("Тест-1");
    }

    @Test(priority = 2)
    private static void test2(){
        System.out.println("Тест-2");
    }

    @Test(priority = 3)
    private static void test3(){
        System.out.println("Тест-3");
    }

    @Test(priority = 4)
    private static void test4(){
        System.out.println("Тест-4");
    }

    @Test(priority = 5)
    private static void test5(){
        System.out.println("Тест-5");
    }

    @Test(priority = 7)
    private static void test6(){
        System.out.println("Тест-6");
    }

    @Test(priority = 7)
    private static void test7(){
        System.out.println("Тест-7");
    }

    @Test(priority = 7)
    private static void test8(){
        System.out.println("Тест-8");
    }

}
