import java.util.ArrayList;

public class Tests
{
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList();
        arr.add("Hello!");
        System.out.println("Размер списка = " + arr.size());
        System.out.println(arr.toString());
        System.out.println(arr.get(0));
    }
}
