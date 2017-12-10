public class HomeWork6
{
    /*
    Использовать интерфейсы!
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина,
        означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат
        в консоль. (Например, dog1.run(150); -> результат: run: true)
    5. *** Переписать крестики-нолики с использованием наследования

     */
    
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        
        dog.run(0);
        dog.run(150);
        dog.run(500);
        dog.run(650);
        
        dog.jump(0.0f);
        dog.jump(0.1f);
        dog.jump(0.5f);
        dog.jump(10.0f);
        
        dog.swim(0);
        dog.swim(5);
        dog.swim(10);
        dog.swim(20);
        
        Cat cat = new Cat();
        
        cat.run(0);
        cat.run(150);
        cat.run(200);
        cat.run(500);
        
        cat.jump(0.0f);
        cat.jump(1.5f);
        cat.jump(2.0f);
        cat.jump(10.0f);
        
        cat.swim(0);
        cat.swim(1);
        cat.swim(10);
        
    }
    
}

interface AnimalInterface
{
    public void run(int meters);
    
    public void swim(int meters);
    
    public void jump(float meters);
}

abstract class Animal implements AnimalInterface
{
}

class Dog extends Animal
{
    public final int MAX_RUN = 500;
    public final float MAX_JUMP = 0.5f;
    public final int MAX_SWIM = 10;
    
    public Dog()
    {
        System.out.println("\nСоздаю собаку...");
        System.out.println("MAX_RUN = " + MAX_RUN);
        System.out.println("MAX_JUMP = " + MAX_JUMP);
        System.out.println("MAX_SWIM = " + MAX_SWIM);
        System.out.println("Собака готова.");
        System.out.println();
    }
    
    @Override
    public void run(int meters)
    {
        if (meters > 0 && meters <= MAX_RUN)
        {
            System.out.println("dog.run(" + meters + "): true");
        } else
        {
            System.out.println("dog.run(" + meters + "): false");
        }
        
    }
    
    @Override
    public void swim(int meters)
    {
        if (meters > 0 && meters <= MAX_SWIM)
        {
            System.out.println("dog.swim(" + meters + "): true");
        } else
        {
            System.out.println("dog.swim(" + meters + "): false");
        }
    }
    
    @Override
    public void jump(float meters)
    {
        if (meters > 0 && meters <= MAX_JUMP)
        {
            System.out.println("dog.jump(" + meters + "): true");
        } else
        {
            System.out.println("dog.jump(" + meters + "): false");
        }
    }
}

class Cat extends Animal
{
    public final int MAX_RUN = 200;
    public final float MAX_JUMP = 2.0f;
    public final int MAX_SWIM = 0;
    
    public Cat()
    {
        System.out.println("\nСоздаю кота...");
        System.out.println("MAX_RUN = " + MAX_RUN);
        System.out.println("MAX_JUMP = " + MAX_JUMP);
        System.out.println("MAX_SWIM = " + MAX_SWIM);
        System.out.println("Кот готов.");
        System.out.println();
    }
    
    @Override
    public void run(int meters)
    {
        if (meters > 0 && meters <= MAX_RUN)
        {
            System.out.println("cat.run(" + meters + "): true");
        } else
        {
            System.out.println("cat.run(" + meters + "): false");
        }
        
    }
    
    @Override
    public void swim(int meters)
    {
        if (meters > 0 && meters <= MAX_SWIM)
        {
            System.out.println("cat.swim(" + meters + "): true");
        } else
        {
            System.out.println("cat.swim(" + meters + "): false");
        }
    }
    
    @Override
    public void jump(float meters)
    {
        if (meters > 0 && meters <= MAX_JUMP)
        {
            System.out.println("cat.jump(" + meters + "): true");
        } else
        {
            System.out.println("cat.jump(" + meters + "): false");
        }
    }
}
