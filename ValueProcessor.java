import java.util.*;

public class ValueProcessor {

    public static LinkedList<String> M1(LinkedList<String> inputList) {
        LinkedList<String> resultList = new LinkedList<>();

        for (String value : inputList) {
            // Adding only non-null values to the result list
            if (value != null) {
                resultList.add(value);
            }
        }

        return resultList;
    }

    public Set<String> M2(LinkedList<String> inputList) {
        Set<String> resultSet = new HashSet<>();

        LinkedList<String> resultList = M1(inputList); // Getting result from M1

        for (String value : resultList) {
            resultSet.add(value); // Adding to set for uniqueness
        }

        return resultSet;
    }

    public static void main(String[] args) {
        LinkedList<String> inputList = new LinkedList<>();
        inputList.add("pranay");
        inputList.add("kusuma");
        inputList.add("Ram");
        inputList.add(null);  // Adding a null value
        inputList.add("pranay");  // Adding a duplicate

        ValueProcessor processor = new ValueProcessor();

        LinkedList<String> resultList = processor.M1(inputList);
        System.out.println("Result of M1 method: " + resultList);

        Set<String> resultSet = processor.M2(inputList);
        System.out.println("Result of M2 method: " + resultSet);
    }
}