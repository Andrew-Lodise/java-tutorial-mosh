//Strings

public class Strings{

    public static void main(String[] args){
        // Long way
        String message = new String("Hello");
        System.out.println("String created the long way: " + message);

        //  Short way
        String name = "Andrew";
        System.out.println("String created the short way: " + name);

        // Adding Strings
        String message2 = "Hello" + "World";
        System.out.println("Adding 2 strings: " + message2);
        // Does not add a space like python

        // String methods
        // .endsWith() -> True/False
        name.endsWith(".");
        System.out.println(name + ".endsWith('w'): " + name.endsWith("w"));

        // .startsWith() -> True/False
        name.startsWith("A");
        System.out.println(name + ".startsWith('A'): " + name.startsWith("A"));

        // .length()
        name.length();
        System.out.println("name.length(): " + name.length());

        // .indexOf()
        name.indexOf("A");
        System.out.println(name + ".indexOf('A'): " + name.indexOf("A"));

        // .replace(a, b) a=target b=replacement
        name.replace("w", "vv");
        System.out.println("replace w with vv: " + name.replace("w", "vv"));

        // .toLowerCase()
        name.toLowerCase();
        System.out.println(name + ".toLowerCase(): " + name.toLowerCase());

        // .toUpperCase()
        name.toUpperCase();
        System.out.println(name + ".toUpperCase(): " + name.toUpperCase());

        // .trim()
        String word = "      pen";
        System.out.println(word + ".trim(): " + word.trim());

        // Escape Sequences
        // to add double quotes
        String sentence = "Hello \"Andrew\"";
        System.out.println(sentence);

        // dealing with backslashes
        String path = "c:\\Windows\\..";
        System.out.println(path);

        // adding a new line
        String name2 = "Andrew\nLodise";
        System.out.println(name2);

        //adding a tab
        String sent = "tab\tnow";
        System.out.println(sent);


    }
}
