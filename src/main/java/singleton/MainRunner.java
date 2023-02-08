package singleton;

/**
 * Singleton относится к порождающим паттернам.
 * Его дословный перевод – одиночка.
 * Этот паттерн гарантирует,
 * что у класса есть только один объект (один экземпляр класса) и к этому объекту предоставляется глобальная точка доступа.
 */

public class MainRunner {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
    }
}
