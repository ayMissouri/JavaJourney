
public class App {
    public static void main(String[] args) {
        java.util.HashMap<String,String> myMap = new java.util.HashMap<String,String>();

        myMap.put("Jim", "01234567890");
        myMap.put("James", "01234567891");
        myMap.put("Tim", "01234567892");
        myMap.put("Emily", "01234567893");
        myMap.put("Emily", "01234567893000000");



        for (String element: myMap.values()) {
            System.out.println(element);
        }
        
        for (java.util.Map.Entry<String,String> element: myMap.entrySet()) {
            System.out.println(element);
        }
    }
}
