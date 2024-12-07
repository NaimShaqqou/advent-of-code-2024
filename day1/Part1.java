import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> l1 = new PriorityQueue<>();
        PriorityQueue<Integer> l2 = new PriorityQueue<>();
        File f = new File("day1.in");
        Scanner in = new Scanner(f);
        while (in.hasNextInt()) {
            l1.offer(in.nextInt());
            l2.offer(in.nextInt());
        }
        in.close();

        int total = 0;
        while (!l1.isEmpty() && !l2.isEmpty()) {
            total += Math.abs(l1.poll() - l2.poll());
        }

        System.out.println(total);
    }
}