package sample_java;
public class inser_example {

    public static void main(String[] args) {
        // Example 1: Inserting a single character at the beginning
        StringBuilder sb1 = new StringBuilder("world");
        sb1.insert(0, 'H');
        System.out.println(sb1);  // Output: Hello world

        // Example 2: Inserting a string at a specific position
        StringBuilder sb2 = new StringBuilder("Quick brown");
        sb2.insert(6, " fox");
        System.out.println(sb2);  // Output: Quick fox brown

        // Example 3: Inserting a substring at the end
        StringBuilder sb3 = new StringBuilder("Java is ");
        sb3.insert(sb3.length(), "awesome!");
        System.out.println(sb3);  // Output: Java is awesome!

        // Example 4: Inserting multiple characters at the beginning
        StringBuilder sb4 = new StringBuilder("programming");
        sb4.insert(0, "Java ");
        System.out.println(sb4);  // Output: Java programming
    }
}
