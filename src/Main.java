public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1,10,0};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
