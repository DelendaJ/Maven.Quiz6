package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer size = end - start + 1;
        Integer[] blah = new Integer[size];
        int index = 0;
        for (int i = start; i <= end; i++) {
            blah[index] = i;
            index++;
        }
        return blah;
    }
    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] unBox = new char[array.length];
        for (char i = 0; i < array.length; i++)
            unBox[i] = array[i];
        return unBox;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
            Character[] boxBox = new Character[array.length];
            for (Character i = 0; i < array.length; i++)
                boxBox[i] = array[i];
            return boxBox;
    }
}
