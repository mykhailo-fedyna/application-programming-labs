package Task5;

public class Task5 {
    public static void main(String[] args) {
        String[][] matrix = {
                {"hello", "world"},
                {"java", "hello"},
                {"sayhello", "hell"}
        };

        String substring = "hell";
        int count = countSubstringInMatrix(matrix, substring);

        System.out.println("Number of occurrences: " + count);
    }

    public static int countSubstringInMatrix(String[][] matrix, String substring) {
        int count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String element = matrix[row][col];
                count += countSubstringInString(element, substring);
            }
        }

        return count;
    }

    public static int countSubstringInString(String text, String substring) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }
}
