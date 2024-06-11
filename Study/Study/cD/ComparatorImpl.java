package Study.cD;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 > i2) {//
            return 1;//swap the numbers
        }
        return -1;//dont swap the numbers

       // return i1-i2;//if result is positive it means it is greater it will move to next indcie by shifting

    }
}
