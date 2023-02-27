public class Main {
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
             if (i % 2 == 0) // четные делятся на два / нечетные не делятся на два
             {
            continue;
             }
        System.out.println(i);
        }
    }
}