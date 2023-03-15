import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        StreamMain streamMain = new StreamMain();

        streamMain.main(intList);

        System.out.println();

        sortedNaturalNumber(intList).forEach(System.out::println);

    }

    public static List<Integer> sortedPositiveNumber(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                result.add(intList.get(i));
            }
        }
        return result;
    }

    public static List<Integer> sortedEvenNumber(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sortedPositiveNumber(intList).size(); i++) {
            if (sortedPositiveNumber(intList).get(i) % 2 == 0) {
                result.add(sortedPositiveNumber(intList).get(i));
            }
        }
        return result;

    }

    public static List<Integer> sortedNaturalNumber(List<Integer> intList) {
        List<Integer> result = sortedEvenNumber(intList);
        result.sort(Comparator.naturalOrder());
        return result;
    }

}