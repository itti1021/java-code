public class NeteruState extends AnimalState {
    public static NeteruState state = new NeteruState();

    private NeteruState(){}

    public static AnimalState getInstance(){return state};

    public void kisyo (Animal animal){
        animal.changeState(HutsuState.getInstance());
    }
}