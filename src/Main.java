public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1,10,0,100,200,39,44};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
        System.out.println(manager.mediumCropped());
    }
}
