import java.util.Arrays;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        if ((array == null) && (array.length == 0 )) //{ throw new java.lang.IllegalArgumentException(); }
        {System.out.println(Arrays.toString(array));}
        if ((array != null) && (array.length != 0 )) {
            int lastVar = array[array.length-1];
            for(int counter = 0;counter<array.length;counter++)
            {

                int curVal = array[counter];
                array[counter] = lastVar;
                lastVar = curVal;
            }
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if ((array == null) && (array.length == 0 ) && (shift <= 0)) //{ throw new java.lang.IllegalArgumentException(); }
        {System.out.println(Arrays.toString(array));}
        while((array != null) && (array.length != 0 ) && (shift > 0)) {
            int lastVar = array[array.length-1];
            for(int counter = 0;counter<array.length;counter++)
            {
                int curVal = array[counter];
                array[counter] = lastVar;
                lastVar = curVal;
            }
            shift--;
        }
    }
}
