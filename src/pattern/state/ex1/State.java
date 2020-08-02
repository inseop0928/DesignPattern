package pattern.state.ex1;

public interface State {
    public void on_botton_pushed(Light light);
    public void off_botton_pushed(Light light);

}
