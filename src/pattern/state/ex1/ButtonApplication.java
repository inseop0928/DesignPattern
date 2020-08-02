package pattern.state.ex1;

public class ButtonApplication {

    public static void main(String[] args){

        Light light = new Light();

        light.onButton();

        light.offButton();

    }
}
