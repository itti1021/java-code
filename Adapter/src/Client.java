public class Client {
    public static void main(String[] args) {
        MoneyManager m;
        m = new MoneyManager();
        m.setValue(10);
        m.setAmount(10);
        int result = m.getPrice();
        System.out.println(result);
    }
}
