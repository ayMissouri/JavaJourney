
public class App {
    public static void printSomething(String args, int amount) {
        for (int i = amount; i > 0; i--) {
            System.out.println(args);
        }
    }

    public static void main(String[] args) {
        printSomething("Message", 7);
    }
}
