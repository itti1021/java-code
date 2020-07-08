public class TanoshiState extends AnimalState {
    public static TanoshiState state = new TanoshiState();

    private TanoshiState(){}

    public static AnimalState getInstance(){return state};

    public void roudou (Animal animal){
        animal.changeState(HutsuState.getInstance());
    }

    public void syokuzi (Animal animal){
        animal.changeState(TanoshiState.getInstance());
    }
}