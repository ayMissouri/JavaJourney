
public class App {
    public static void main(String[] args) {
        boolean loopControl = true;
        while (loopControl) {
            System.out.println("STUCK IN A LOOP");
            loopControl = false;
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("Counter is "+ counter);
            counter++;
            if (counter == 10) {
                System.out.println("Counter has reached 10!");
            }
        }
    }
}
