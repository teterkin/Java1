public class HomeWork1 {

    public static void main(String[] args) {

        // Примитивные:
        byte bytie = -127;
        short shortie = -32768;
        int intuchhie = -2147483648;
        long longing = 0;
        float floatic = 120.0f;
        double ticket2Doublin = 12.569;
        boolean boolie = true;
        char charka = 'A';

        // Ссылочные
        String stringie = "Hi!";
        Integer objIntie = 0;

        // Для задачи
        int a = 25;
        int b = 1;
        int c = 4;
        int d = 2;

        // Простая математика
        System.out.println(simpleMath(a,b,c,d));

        // Проверка суммы
        System.out.println(isBetween1020(10,20));
        System.out.println(isBetween1020(5,5));

        // Проверка положительности
        System.out.println(isPositive(0));
        System.out.println(isPositive(-5));
        System.out.println(isPositive(10));

        // Проверка отрицательности
        System.out.println(isNegative(0));
        System.out.println(isNegative(-5));
        System.out.println(isNegative(10));

        // Здороваемся
        sayHello("Вася");
        sayHello("Марина");
        sayHello("Макс");

        // Проверка високосности

        // Примеры для проверки:
        // 1900 год не был високосным, он  делится на 4, а также на 100, но не на 400.
        // 2000 год был високосным, он делится на 4 , на  100 и  на 400 полностью.
        // 2008 год является високосным, он делится на 4, но не на 100 или 400 без остатка.
        isItLeapYear(1900);
        isItLeapYear(2000);
        isItLeapYear(2008);

    }

    public static int simpleMath(int a, int b, int c, int d) {
        return (a*(b+(c/d)));
    }

    public static boolean isBetween1020(int num1, int num2) {
        boolean RC = false;
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            RC = true;
        }
        return RC;
    }

    public static String isPositive(int num) {
        String RC;
        if (num<0) {
            RC="Отрицательное!";
        } else {
            RC="Положительное!";
        }
        return RC;
    }

    public static boolean isNegative(int num) {
        boolean RC = false;
        if (num<0) RC = true;
        return RC;
    }

    public static void sayHello(String name) {
        System.out.println("Привет, "+ name + "!");
    }

    public static void isItLeapYear(int year) {
        // Алгоритм немного отличается от задания, т.к. реально
        // в Григорианском календаре год является високосным в двух случаях:
        // либо он кратен 4, но при этом не кратен 100,
        // либо кратен 400.

        if (year % 400 == 0) {
            System.out.println("Число [" + year + "] кратно 400. Это високосный год!");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Число [" + year + "] кратно 4, но не кратно 100. Это високосный год!");
        } else {
            System.out.println("Год [" + year + "] не високосный!");
        }
    }
}