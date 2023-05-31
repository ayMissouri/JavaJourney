import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Tom Scott");
        nameList.add("Barry AlLen");
        nameList.add("Harry Potter");
        nameList.add("Dwayne Johnson");
        nameList.add("Walter White");

        for (String element: nameList) {
            System.out.println(element);
        }

//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(nameList.get(i));
//        }
    }
}
