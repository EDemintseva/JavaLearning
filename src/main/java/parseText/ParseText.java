package parseText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParseText {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> words = new TreeMap<>();
        Integer maxCounter = 0;
        String maxWord = "";

        //Получение текста
        StringBuilder builder = new StringBuilder("");
        File file = new File(ClassLoader.getSystemResource("parseText/TextForParse.txt").getFile());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            builder.append(line).append(" ");
        }
        scanner.close();
        String text = builder.toString();

        //Заполнение набора слов с подсчётом количества
        for(String word : text.split(" ")) {
            words.put(word, words.containsKey(word) ? words.get(word)+1 : 1);
        }

        //Вывод статистики о словах в исходном файле
        System.out.println("List of words: ");
        for (Map.Entry<String, Integer> w : words.entrySet()) {
            System.out.println(w);
            if(w.getValue() > maxCounter) {
                maxWord = w.getKey();
                maxCounter = w.getValue();
            }
        }
        System.out.println("The most repeated word is '" + maxWord + "'. It has been used " + maxCounter + " times.");
    }
}
