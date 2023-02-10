import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        int[] array1 = {peter, amy, john,boyd,cathy};
        int[] array2 = {9, 10, 12,14,15};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}