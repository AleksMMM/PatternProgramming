package adapter;

/**
 * Адаптер — это структурный паттерн проектирования,
 * который позволяет объектам с несовместимыми интерфейсами работать вместе.
 */
public class MainRunner {

    public static void main(String[] args) {

        Letter letter = new Letter("new message");

        Adapter adapter = new Adapter(letter);

        System.out.println(createTitle(adapter));
    }

    public static String createTitle(ShortMess mess) {
        return "новый заголовок " + mess.getMessage();
    }
}
