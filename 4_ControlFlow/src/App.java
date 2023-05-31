
public class App {
    public static void main(String[] args) {
        int ageOfViewer = 21;

        if (ageOfViewer > 18) {
            System.out.println("You are over 18!");
        } else {
            System.out.println("You are under 18!");
        }
        
        
        
        int timeOfDay = 7;

        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <=18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good Evening!");
        }
    }
}
