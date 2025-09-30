import java.util.*;

public class CacheLocalityExample {
    static long traverseList(List<Integer> list){
        long s = 0;
        for (int v : list) s += v;
        return s;
    }

    public static void main(String[] args) throws Exception {
        int N = 9_000_000; // 500k
        List<Integer> arrayList = new ArrayList<>(N);
        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < N; ++i){ arrayList.add(i); linkedList.add(i); }

        long t0 = System.nanoTime(); long sa = traverseList(arrayList); long t1 = System.nanoTime();
        long t2 = System.nanoTime(); long sl = traverseList(linkedList); long t3 = System.nanoTime();

        System.out.println("ArrayList sum=" + sa + " time=" + ((t1 - t0) / 1_000_000) + " ms");
        System.out.println("LinkedList sum=" + sl + " time=" + ((t3 - t2) / 1_000_000) + " ms");
        System.out.println("Arraylist ที่เร็วกว่าเกิดจาก cache locality");

        Thread.sleep(60_000);
    }
}