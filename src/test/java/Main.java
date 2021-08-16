public class Main {

    // Пример тестового задания для мидла java. Надо из строки типа aaabbcccc получить вариант a3b2c4
    public static void main(String[] args) {
        String raw = "aaabbcccc";
        String result = compress(raw);
        System.out.println(result);
    }

    public static String compress(String line) {
        int currentNum = 1;
        StringBuilder result = new StringBuilder();

        for (int i=1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i-1)) {
                currentNum++;
                continue;
            }
                result.append(line.charAt(i-1));
                result.append(currentNum);
                currentNum = 1;
        }
        result.append(line.charAt(line.length() - 1));
        result.append(currentNum);

        return result.toString();
    }
}