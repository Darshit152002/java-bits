import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class customComparator implements Comparator{
    public int compare (Object o1, Object o2) {
        int s1 = (int) o1;
        int s2 = (int) o2;
        int count_s1 = 0;
        for (int i = 1; i <= Math.sqrt(s1); i++) {
            if (s1 % i == 0) {
                if (i * i == s1) {
                    count_s1++;
                } else {
                    count_s1 += 2;
                }
            }
        }
            int count_s2 = 0;
            for (int i = 1; i <= Math.sqrt(s2); i++) {
                if (s2 % i == 0) {
                    if (i * i == s2) {
                        count_s2++;
                    } else {
                        count_s2 += 2;
                    }
                }
            }
            if (count_s1 < count_s2) {
                return -1;
            } else if (count_s1 > count_s2) {
                return 1;
            } else {
                return s1 - s2;
            }
    }
}
public class Main {
    public ArrayList<Integer> solve(ArrayList<Integer> A){
        Collections.sort(A, new customComparator());
        return A;
    }
    public static void main(String[] args) {

    }
}