public class HutsuState extends AnimalState {
    public static HutsuState state = new HutsuState();

    private HutsuState(){}

    public static AnimalState getInstance(){return state};

    public void roudou (Animal animal){
        animal.changeState(IrairaState.getInstance());
    }

    public void syokuzi (Animal animal){
        animal.changeState(TanoshiState.getInstance());
    }
}