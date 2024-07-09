package strings;

public class StringMethods {
    public static void main(String[] args) {

        String name = "   ajsJLKd72   ";
        System.out.println(name.toLowerCase());

        System.out.println(name.trim());
        System.out.println("amrit".startsWith("uew"));
        System.out.println("roshani".endsWith("ni"));

        char temp = "Carpet".charAt(3);

        System.out.println(temp);

        int age = 12;
        String stringAge = String.valueOf(age);
        System.out.println(age*2);
        System.out.println(stringAge+2);

        String sentence = "I love Java, Java Java, very much";

        String newSentence = sentence.replace("Java","Python");

        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains("Java"));

        String substring = sentence.substring(2);
        System.out.println(substring);

        String words[] = sentence.split("a");
        for(String word : words)
        {
            System.out.println(word);

        }
        String color = "Black";


         char letters[] = color.toCharArray();
         letters[0] = 'H';
         for (char letter:letters)
         {
             System.out.println(letter);
         }

         String str = "   ";
        System.out.println(str.isBlank());

    }
}
