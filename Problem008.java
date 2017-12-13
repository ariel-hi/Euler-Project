import java.util.*;
import java.io.*;

public class Problem008 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>();

        File f = new File("Problem008.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                list.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        sc.close();

        int index = 0;  // index of list
        long max = 0;    // max product found
        long curr = 1;   // current product
        long loaded = 0; // number of digits considered in the current product

        for (int i = 0; i < list.size(); i++) {
            int digit = list.get(index);
            if (digit == 0) {
                curr = 1;
                loaded = 0;
            } else {
                curr *= digit;
                loaded++;
                if (loaded > 13) {
                    curr /= list.get(index - 13);
                    if (curr > max) {
                        max = curr;
                    }
                }
            }
            index++;
        }

        System.out.println(max);
    }
}
