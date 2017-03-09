
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public class Complementary {
    
    void searchPairSums (int[] array, int sum) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + "" + array[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}
