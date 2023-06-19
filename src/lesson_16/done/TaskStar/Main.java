package lesson_16.done.TaskStar;

public class Main {
    public static void main(String[] args) {
        String line = "He(ll{o )wo[r(l)]})d";
        line = line.replaceAll("[^(){}\\]\\[]+","");
        System.out.println(line);

        while (line.contains("()") || line.contains("[]") || line.contains("{}")) {
            line = line.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        System.out.println(line.length() == 0);
    }
}
