package adapter;

public class Adapter implements ShortMess {

    private Letter letter;

    public Adapter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String getMessage() {
        return letter.getMassege();
    }
}
