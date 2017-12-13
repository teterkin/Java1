/**
 *  1. Расширить задачу про котов и тарелки с едой
 *  2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества
 *  еды (например, в миске 10 еды, а кот пытается покушать 15-20)
 *  3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 *     Если коту удалось покушать (хватило еды), сытость = true
 *  4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
 *     то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 *  5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 *     и потом вывести информацию о сытости котов в консоль
 *  6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 *  На Exelent - графическое приложение про Котов.
 *  @author teterkin@gmail.com
 *  @version 20171213
 *  @link https://github.com/teterkin/Java1/blob/master/src/HowmeWork7.java
 */
public class HowmeWork7
{
    public static void main(String[] args)
    {
        SmartCat cat = new SmartCat("Барсик", 10);
        Plate plate = new Plate(50);
        
        System.out.println(plate);
        System.out.println(cat);
        
        cat.eat(plate);
    
        System.out.println(plate);
    }
}

class SmartCat
{
    private String name;
    private int appetite;
    
    public SmartCat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
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
    
    void eat(Plate plate)
    {
        System.out.println(name + ": Ням-ням.");
        plate.decreaseFood(appetite);
    }
    
    @Override
    public String toString()
    {
        return "Кот {" +
                " кличка = '" + name + '\'' +
                ", аппетит = " + appetite +
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
}
