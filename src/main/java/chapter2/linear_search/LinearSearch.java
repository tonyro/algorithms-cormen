package chapter2.linear_search;

/**
 * 2.1-3
 * Consider the searching problem:
 * Input:
 * A sequence of n numbers A = [a1, a2, ... , an] and a value {v}.
 * Output:
 * An index {i} such that v = A[i] or the special value NIL if {v} does not appear in {A}.
 */


public class LinearSearch
{
    public static Integer findValueIndex(Integer[] array, Integer value) {
        Integer valueIndex = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                valueIndex = i + 1;
            }
        }

        return valueIndex;
    }

    public static void main(String[] args) {
        String phrase = "Value [%d] is at position [%d].\n";
        Integer[] array = new Integer[] {2, 5, 3, 8, 45, 78, 9, 2, 6, 7, 12, 4};

        System.out.println(String.format("Length of the array is: %d.", array.length));
        System.out.printf(phrase, 8, findValueIndex(array, 8));
        System.out.printf(phrase, 45, findValueIndex(array, 45));
        System.out.printf(phrase, 4, findValueIndex(array, 4));
        System.out.printf(phrase, 2, findValueIndex(array, 2));
        System.out.printf(phrase, 33, findValueIndex(array, 33));
    }
}
