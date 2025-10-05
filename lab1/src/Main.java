public class Main {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello World";
        String c = "Hello World name";

        final String[] list = {a, b, c};
        final Integer[] lengths = {};

        for (int i = 0; i < list.length; i++) {
            int length = list[i].length();
            lengths[i] = length;

        }

    }
}
