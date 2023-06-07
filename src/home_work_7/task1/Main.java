package home_work_7.task1;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo. У класі створити список, який записати
 * 8 тварин через метод add(index, element). Вивести список у консоль.
 */

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(0,"Пелікан");
        zoo.add(1,"Слон");
        zoo.add(2, "Жираф");
        zoo.add(3, "Бегемот");
        zoo.add(4, "Лев");
        zoo.add(5, "Тигр");
        zoo.add(6, "Черепаха");
        zoo.add(7, "Вовк");

        for (String animal : zoo.getAnimals()) {
            System.out.println(animal);
        }
    }
}
