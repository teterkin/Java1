public class Tests
{
    public static void main(String[] args)
    {
        GazStove stove1 = new GazStove();
        stove1.turnLeft();
        stove1.turnRight();
    
        System.out.println("---");
        
        GazStoveWithGrill stove2 = new GazStoveWithGrill();
        stove2.turnLeft();
        stove2.Grill();
    }
}

interface Handle
{
    public void turnLeft();
    public void turnRight();
}

class GazStove implements Handle
{
    public GazStove()
    {
        System.out.println("Создаю газовую плиту...");
    }
    
    @Override
    public void turnLeft()
    {
        System.out.println("поворачиваем ручку влево...");
    }
    
    @Override
    public void turnRight()
    {
        System.out.println("поворачиваем ручку вправо...");
    }
}

class GazStoveWithGrill extends GazStove
{
    public GazStoveWithGrill()
    {
        System.out.println("И создаю плиту не простую, а с грилем...");
    }
    
    public void Grill()
    {
        System.out.println("Жарю мясо!");
    }
}

