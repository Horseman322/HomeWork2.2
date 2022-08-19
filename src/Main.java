public class Main {
    public static void main(String[] args) {
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 99, 96, 75, 99, 67);
        Gryffindor Ron = new Gryffindor("Рон Узли", 75, 58, 24, 60, 15);
        Gryffindor Hermione = new Gryffindor("Гермиона грейнджер", 80, 65, 32, 74, 82);
        Hufflepuff Zachariah = new Hufflepuff("Захария Смит", 64, 78, 62, 54, 12);
        Hufflepuff Cedrick = new Hufflepuff("Седрик Диггори", 34, 65, 32, 74, 25);
        Hufflepuff Justin = new Hufflepuff("Джастин Финч-Флетчер", 78, 65, 22, 87, 46);
        Ravenclaw Zhou = new Ravenclaw("Чжоу Чанг", 42, 74, 12, 65, 15, 86);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 67, 23, 45, 91, 58, 49);
        Ravenclaw Markus = new Ravenclaw("Маркус Белби", 73, 49, 37, 42, 46, 65);
        Slytherin Draco = new Slytherin("Драко Малфой", 86, 90, 85, 18, 73, 35, 95);
        Slytherin Graham = new Slytherin("Грэхэм Монтегю", 58, 75, 45, 48, 46, 46, 88);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 46, 46, 76, 62, 16, 34, 33);
    Harry.compareHogwards(Draco);
    }

}