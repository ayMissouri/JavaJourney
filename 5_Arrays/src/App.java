
public class App {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        System.out.println(arrayOfNumbers[1]);
        
        for (int element: arrayOfNumbers) {
            System.out.println(element);
        }
        
        arrayOfNumbers[2] = 12;
        System.out.println(arrayOfNumbers[2]);
        
        
        Integer[] myIntArray = {1, 2, 3, 4, 5};

        java.util.List<Integer> myList = java.util.Arrays.asList(myIntArray);
        java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>(myList);

        myArrayList.set(2, 10);
        myArrayList.add(50);

        for (int element: myArrayList) {
            System.out.println(element);
        }
        
        myArrayList.size()
    }
}
