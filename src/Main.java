public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 99, 4, 34, 28, 67, 89};

        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Максимально продано раз: " + salesManager.max());
    }
}