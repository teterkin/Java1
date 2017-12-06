import java.util.Arrays;
import java.util.Scanner;

/**
 * Домашнее задание №4
 * Игра Крестики-Нолики
 * Начинаем понемногу осваивать обектно-ориентированные методы.
 * Еще пока не на полную мощь.
 *
 * @author teterkin@gmail.com
 * @version 02/12/2017
 * @link https://github.com/teterkin/Java1.git
 */
public class HomeWork4
{
    final int mySIZE = 3;  //5
    final int myTreshold = 3;  //4
    final char myX = 'x';
    final char myO = 'o';
    final char myEmpty = '.';
    char[][] myMap = new char[mySIZE][mySIZE];
    Boolean Done = false;
    Scanner scanner = new Scanner(System.in);
    int[] line = new int[(mySIZE * 2 + 2)];
    int[][] moves = new int[2][10];
    int moveNum = 0;
    
    /**
     * Запуск главного метода класса.
     * Он инициализирует класс с помощью конструктора и запускает основной цикл игры.
     * По завершении работы основного цикла метод прощается с игроком.
     *
     * @param args Аргументы командной строки не используются.
     */
    public static void main(String[] args)
    {
        HomeWork4 hw = new HomeWork4();
        hw.run();
        System.out.println("Пока!");
        
    }
    
    /**
     * Конструктор класса. Инициализирует наш объект.
     */
    HomeWork4()
    {
        System.out.println("\nИгра началась!");
        initMap();
        displayMap();
    }
    
    /**
     * Инициализируем игровое поле.
     */
    private void initMap()
    {
        System.out.println("Подготавливаю крестики и нолики...");
        for (int i = 0; i < mySIZE; i++)
        {
            for (int j = 0; j < mySIZE; j++)
            {
                myMap[i][j] = '.';
            }
        }
        System.out.println("Готово.");
    }
    
    /**
     * Отображение игрового поля
     */
    private void displayMap()
    {
        System.out.print("  ");
        for (int i = 0; i < mySIZE; i++)
        {
            System.out.print((i+1) + " ");
        }
        System.out.println();
        for (int i = 0; i < mySIZE; i++)
        {
            System.out.print((i+1) + " ");
            for (int j = 0; j < mySIZE; j++)
            {
                System.out.print(myMap[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * Основной цикл игры
     */
    private void run()
    {
        while (!Done)
        {
            playerTurn();
            displayMap();
            if (checkIfWin(myX))
            {
                System.out.println("Ты выиграл! Уррра!!!");
                Done = true;
            }
            else
            {
                if (!isFull())
                {
                    aiTurn();
                    displayMap();
                    if (checkIfWin(myO))
                    {
                        
                        
                        
                        System.out.println("Искусственный интеллект выиграл! " +
                                "Но ты приходи, если что... ;)");
                        Done = true;
                    }
                    else
                    {
                        isFull();
                    }
                }
            }
        }
    }
    
    /**
     * Ход искусственного интеллекта
     */
    private void aiTurn()
    {
        boolean keepAsking = true;
        boolean goRandom = false;
        int mapX = 0;
        int mapY = 0;
        
        System.out.println("Тэкс... ИИ думает...");
        
        while (keepAsking)
        {
            // Сначала попробуем продолжить ход игрока
            /*
                DEBUG:
                System.out.println("Array of moves:");
                System.out.println(Arrays.toString(moves[0]));
                System.out.println(Arrays.toString(moves[1]));
            */
            if (moveNum > 1)
            {
                mapY = moves[0][moveNum-1] - moves[0][moveNum-2] + moves[0][moveNum-1];
                mapX = moves[1][moveNum-1] - moves[1][moveNum-2] + moves[1][moveNum-1];
                /*
                    DEBUG:
                    System.out.println("MapX = " + MapX);
                    System.out.println("MapY = " + MapY);
                */
                if (!isValid(mapX, mapY))
                {
                    goRandom = true;
                }
            }
            else
            {
                goRandom = true;
            }
            
            if (goRandom)
            {
                // Если не получилось ищем случайно
                mapX = (int) (Math.random() * mySIZE + 1);
                mapY = (int) (Math.random() * mySIZE + 1);
            }
            
            if (isValid(mapX, mapY))
            {
                keepAsking = false;
                myMap[mapX - 1][mapY - 1] = myO;
                System.out.println("Он ходит: [" + (mapY) + "," + (mapX) + "]");
                System.out.println();
            }
        }
    }
    
    /**
     * Проверка на заполненность игрового поля.
     * Если так,  то игра заканчивается Ничьёй.
     */
    private boolean isFull()
    {
        boolean isFull = true;
        for (int i = 0; i < mySIZE; i++)
        {
            for (int j = 0; j < mySIZE; j++)
            {
                if (myMap[i][j] == '.')
                {
                    isFull = false;
                }
            }
        }
        if (isFull)
        {
            Done = true;
            System.out.println("Ничья!");
        }
        return isFull;
    }
    
    /**
     * Проверка выигрыша крестиков или ноликов.
     *
     * @param myChar В этой переменной указывается, что проверяем, крестики или нолики?
     *               Мы используем константы определенные в начале класса.
     */
    private boolean checkIfWin(char myChar)
    {
        /*
            Должен быть один цикл который просто делает 3 складывания
            При этом он должен сложить 8 переменных и в конце их все проверить, есть ли
            линия.
        }*/
        // Надо обнудять перед новым циколом
        for (int i = 0; i < line.length; i++)
        {
            line[i] = 0;
        }
        
        //сверху вниз
        for (int i = 0; i < mySIZE; i++)
        {
            for (int j = 0; j < mySIZE; j++)
            {
                // Горизонтальная линия
                if (myMap[i][j] == myChar)
                {
                    line[i]++;
                }
                // Вертикальная линия
                if (myMap[j][i] == myChar)
                {
                    line[(i+mySIZE)]++;
                }
            }
            // слева направо сверху вних
            if (myMap[i][i] == myChar)
            {
                line[(mySIZE * 2)]++;
            }
            // слева направо снизу вверх
            if (myMap[i][(mySIZE-i-1)] == myChar)
            {
                line[7]++;
            }
        }
        // System.out.println();
        boolean didIWon = false;
        for (int i = 0; i < line.length; i++)
        {
            //System.out.print(line[i]+" ");
            if (line[i] >= myTreshold)
            {
                didIWon = true;
            }
        }
        // System.out.println();
        return didIWon;
    }
    
    /**
     * Ход игрока. запрашиваем ввод координат для крестика.
     * Число от 1 до 3-х, как для X, так и для Y.
     */
    private void playerTurn()
    {
        boolean keepAsking = true;
        while (keepAsking)
        {
            String strNormalSize = "\033[0;0m";
            String strBoldSize = "\033[0;1m";
            System.out.println("Введите координаты крестика ("+strBoldSize+"X,Y"+strNormalSize+") через пробел.");
            System.out.println("Обе координаты должны быть в пределах от 1 до " + mySIZE + ".");
            System.out.print("=> ");
            int mapX = 0;
            int mapY = 0;
            /*
                Используем try-catch чтобы не вводили всякую ерунду.
            */
            try
            {
                mapY = scanner.nextInt();
                mapX = scanner.nextInt();
                if (isValid(mapX, mapY))
                {
                    keepAsking = false;
                    myMap[mapX - 1][mapY - 1] = myX;
                    System.out.println("\nТы сходил: [" + (mapY) + "," + (mapX) + "]");
                    System.out.println();
                    moves[0][moveNum] = mapY;
                    moves[1][moveNum] = mapX;
                    moveNum++;
                } else
                {
                    System.out.println("Сюда крестик не поставишь :(");
                    displayMap();
                }
            } catch (Exception e)
            {
                // e.printStackTrace();
                System.out.println("Ошибочка вышла. Попробуй ещё!");
                scanner.next(); // Это нужно чтобы не было бесконечного цикла с ошибкой
                displayMap();
            }
        }
    }
    
    private boolean isValid(int x, int y)
    {
        boolean isValid = false;
        if (x > 0 && x <= mySIZE && y > 0 && y <= mySIZE && myMap[x - 1][y - 1] == '.')
        {
            isValid = true;
        }
        return isValid;
    }
}
