import java.util.ArrayList;
import java.util.List;

public class ArrayListEX {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(1);

        // nums.get(1);
        // nums.set(0, 10);
        // nums.isEmpty();

        for (int i : nums) {

            System.out.println(i);
        }
    }

}
