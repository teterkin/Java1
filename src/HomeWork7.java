/**
 * 1. Расширить задачу про котов и тарелки с едой
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества
 * еды (например, в миске 10 еды, а кот пытается покушать 15-20)
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true
 * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 * и потом вывести информацию о сытости котов в консоль
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 * На Exelent - графическое приложение про Котов.
 *
 * @author teterkin@gmail.com
 * @version 20171213
 * @link https://github.com/teterkin/Java1/blob/master/src/HowmeWork7.java
 */
public class HomeWork7
{
    public static void main(String[] args)
    {
        Plate plate = new Plate(50);
//        SmartCat cat = new SmartCat("Барсик", 10);
//
//        System.out.println(plate);
//        System.out.println(cat);
//
//        System.out.println("\nБарсик поест 10 раз:");
//        // Tests for negative number of food amounts.
//        for (int i = 0; i < 10; i++)
//        {
//            cat.eat(plate);
//            System.out.println(plate);
//        }

        System.out.println("\nСоздадим 10 котов:");
        String[] catNames = {"Ешка", "Барсик", "Кузя", "Алекс", "Кекс", "Мурзик", "Персик",
                "Марсик", "Лаки", "Тишка"};
        SmartCat[] cats = new SmartCat[10];
        int idx = 0;
        for (String nextCat : catNames)
        {
            //System.out.println(nextCat);
            cats[idx] = new SmartCat(nextCat, (int) (Math.random() * 6 + 5));
            System.out.println(cats[idx]);
            idx++;
        }

        System.out.println("\nНаполним тарелку:");
        plate.setFood(50);
        System.out.println(plate);

        System.out.println("\nНачнем по очереди кормить котов:");
        System.out.println("Всего у нас " + idx + " котов.");
        for (int i = 0; i < 10; i++)
        {
            boolean result = cats[i].eat(plate);
            if (result)
            {
                cats[i].setHungry(false);
            }
            System.out.println(plate);
        }
        System.out.println("Надеюсь, всем хватило?");

        System.out.println("\nПосмотрим, сыты ли коты?");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(cats[i]);
        }
    }
}

class SmartCat
{
    private String name;
    private int appetite;
    private boolean hungry;

    public SmartCat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public boolean isHungry()
    {
        return hungry;
    }

    public void setHungry(boolean hungry)
    {
        this.hungry = hungry;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAppetite()
    {
        return appetite;
    }

    public void setAppetite(int appetite)
    {
        this.appetite = appetite;
    }

    boolean eat(Plate plate)
    {
        boolean haveEatten = false;
        if (plate.getFood() >= appetite)
        {
            System.out.println(name + ": Хрум-хрум.");
            plate.decreaseFood(appetite);
            haveEatten = true;
        } else
        {
            System.out.println(name + ": Мяяяяу!!!");
        }
        return haveEatten;
    }

    @Override
    public String toString()
    {
        return "Кот {" +
                " кличка = '" + name + '\'' +
                ", аппетит = " + appetite +
                ", голоден = " + hungry +
                " }";
    }
}

class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    void decreaseFood(int appetite)
    {
        this.food -= appetite;
    }

    @Override
    public String toString()
    {
        return "Тарелка { еда = " + food + " }";
    }

    public int getFood()
    {
        return food;
    }

    public void setFood(int food)
    {
        this.food = food;
    }
}
