public class CatRunner {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Silly", 2, 4.5);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Yippee", 9, 6.8);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
