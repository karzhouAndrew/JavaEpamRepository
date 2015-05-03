package lab3;
/**
 * Имеется строка с текстом.
 * Подсчитать количество слов в тексте.
 * Желательно учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Hometask3_2 {
    public static void main(String[] args) {
        int sum = 0;
        String text = " hfgy jfhf  jfjfj     try  u ";
        char[] stringToCharArray = text.toCharArray();
        if (stringToCharArray[0] != ' ') {
            sum=1;
        }
        for (int i=0; i<text.length()-1; i++) {
            if (stringToCharArray[i] == ' '&& stringToCharArray[i+1] !=' ') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
