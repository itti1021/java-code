public class MoneyManager extends CostManager implements Goods {
    private int value;
    private int amount;

    public void setValue(int a) {
        value = a;
    }

    public void setAmount(int a) {
        amount = a;
    }

    public int getPrice() {
        return (int)(compute(value, amount) * 1.1);
    }
}
