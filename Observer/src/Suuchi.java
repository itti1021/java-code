class Suuchi extends Subject {
    int suuchiState;
    int atai;
    public int getState() {
        return suuchiState;
    }
    public void putValue(int atai) {
        if (atai > this.atai) {
            this.atai = atai;
            this.tsuuchi();
        }
    }
    public int getValue() {
        return atai;
    }
}