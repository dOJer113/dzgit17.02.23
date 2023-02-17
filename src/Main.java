public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{1,10,0};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
        System.out.println(manager.mediumCropped());
    }
}
