public class IrairaState extends AnimalState {
    public static IrairaState state = new IrairaState();

    private IrairaState(){}

    public static AnimalState getInstance(){return state};

    public void roudou (Animal animal){
        animal.changeState(IrairaState.getInstance());
    }

    public void syokuzi (Animal animal){
        animal.changeState(TanoshiState.getInstance());
    }

    public void suimin (Animal animal){
        animal.changeState(NeteruState.getInstance());
    }
}