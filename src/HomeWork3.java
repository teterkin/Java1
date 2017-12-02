import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3
{
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        /*
        Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное
        пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        System.out.println("\nДобро пожаловать в игру УГАДАЙКА!");
        boolean wannaPlay = true;
        Scanner scanner = new Scanner(System.in);
        while (wannaPlay)
        {
            int won = guessGame();
            switch (won)
            {
                case 0:
                    System.out.println("Ты выиграл! :)");
                    break;
                case 1:
                    System.out.println("Жаль. Ты проиграл. :(");
                    break;
                default:
                    System.out.println("Something went wrong! :-|");
            }
            System.out.println("\nСыграем ещё? 1 – да / 0 – нет");
            int yesNo = scanner.nextInt();
            if (yesNo == 0)
            {
                wannaPlay = false;
                System.out.printf("Пока!");
            }
        }
        
        
        /*
        Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
        "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
        "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
        "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
         */
        System.out.printf("\nБонусная игра! Спасибо biblelamp за развлечение!\n");
        guessTheWord();
        scanner.close();
    }
    
    private static int guessGame()
    {
        int won = -1; // something else
        int number = (int) (Math.random() * 10);
        // DEBUG
        //System.out.println(number);
        System.out.println("\nЯ загадал число от 0 до 9. Угадай его! У тебя только 3 попытки:\n");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Попытка № " + i + " => ");
            int guess = scanner.nextInt();
            if (guess == number)
            {
                won = 0;
                System.out.println("Уррра!!!");
                break;
            } else
            {
                won = 1;
                if (guess < number)
                {
                    System.out.println("Нет. Моё чуть побольше...");
                }
                else
                {
                    System.out.println("Не. Моё чуть поменьше...");
                }
            }
        }
        return won; //change
    }
    
    static void guessTheWord() {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess = null;
        String word = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.print("Guess the word: ");
            guess = sc.next();
            for (int i = 0; i < 15; i++)
                System.out.print(
                        (i < word.length() && i < guess.length()
                                && word.charAt(i) == guess.charAt(i))?
                                word.charAt(i) : ((word.equals(guess))? "" : "#"));
            System.out.println();
        } while (!word.equals(guess));
    }
}
