package homeWork1;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("Create String:");

        String originalText = new String("I study Basic Java!");

        String text = originalText;

        System.out.println(text);
        // ---- получение длины строки -----

        System.out.println("-------------------------------------------------------");

        System.out.println("Last symbol:");

        System.out.println("Last symbol is - " + text.charAt(text.length() - 1));

        System.out.println("-------------------------------------------------------");

        System.out.println("Checking 'Java':");

        String weAreSearch = "Java";

        boolean resultContains = text.contains(weAreSearch);

        System.out.println("Is text contains our substring " + weAreSearch + "? - " + resultContains);

        System.out.println("-------------------------------------------------------");

        System.out.println("Upper case and lower case");

        String textUpperCase = text.toUpperCase();

        System.out.println("Upper case: " + textUpperCase);

        System.out.println("Lower case: " + text.toLowerCase());

        System.out.println("-------------------------------------------------------");

        System.out.println("Cut 'Java'");

        int textIndex = text.indexOf("Java");

        System.out.println("index contains is - " + textIndex);

        String substring = text.substring(textIndex, textIndex + 4);
        System.out.println(substring);

    }
}