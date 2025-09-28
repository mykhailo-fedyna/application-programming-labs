package Task4;

public class Task4Second {
    char character;
    int count;

    public Task4Second(char character, int count) {
        this.character = character;
        this.count = count;
    }

    @Override
    public String toString() {
        return "'" + character + "' : " + count;
    }
}
