import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static String inputString =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                    "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                    "aute irure dolor in reprehenderit in voluptate velit esse " +
                    "cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                    "occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> charDistribution = new HashMap<>();


        char[] chars = inputString.toCharArray();


        for (char c : chars) {
            charDistribution.put(c, charDistribution.getOrDefault(c, 0) + 1);
        }


        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int currentInt;
        for (Map.Entry<Character, Integer> characterIntegerEntry : charDistribution.entrySet()) {
            currentInt = characterIntegerEntry.getValue();
            if (currentInt > maximum) {
                maximum = currentInt;
            }
            if (currentInt < minimum) {
                minimum = currentInt;
            }
        }
        System.out.printf("Minimum chars: %d, Maximum chars: %d\n", minimum, maximum);


        minimum = Integer.MAX_VALUE;
        maximum = Integer.MIN_VALUE;
        Integer[] values = charDistribution.values().toArray(new Integer[0]);
        for (Integer value : values) {
            if (value > maximum) {
                maximum = value;
            }
            if (value < minimum) {
                minimum = value;
            }
        }
        System.out.printf("Minimum chars: %d, Maximum chars: %d\n", minimum, maximum);
    }
}
