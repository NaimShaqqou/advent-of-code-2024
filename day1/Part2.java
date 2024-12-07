import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        File f = new File("day1.in");
        Scanner in = new Scanner(f);
        while (in.hasNextInt()) {
            l1.add(in.nextInt());
            int rightNum = in.nextInt();
            freq.put(rightNum, freq.getOrDefault(rightNum, 0) + 1);
        }
        in.close();

        int total = 0;
        for (int num : l1) {
            total += num * freq.getOrDefault(num, 0);
        }
        System.out.println(total);
    }
}