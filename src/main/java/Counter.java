public class Counter {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static int i = MIN;

    public static void counter(String threadName) {
        for (; i < MAX; i++) {
            System.out.println(threadName + " value = " + i);
        }
    }
}
