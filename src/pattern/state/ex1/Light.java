package pattern.state.ex1;

public class Light {
    private State state;

    public Light(){
        state = ButtonOff.getInstance();
    }

    public void setState(State state){
        this.state = state;
    }

    public void onButton(){
        state.on_botton_pushed(this);
    }

    public void offButton(){
        state.off_botton_pushed(this);
    }
}
