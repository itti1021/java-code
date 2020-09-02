class NishinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }
    private void print(int n) {
        System.out.println( n + "を 2 進数で表示します");
        System.out.println(Integer.toBinaryString(n));
    }
}