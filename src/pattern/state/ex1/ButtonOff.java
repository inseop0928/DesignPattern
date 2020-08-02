package pattern.state.ex1;

public class ButtonOff implements State {

    private static ButtonOff buttonOff = new ButtonOff();//인스턴스로 초기화

    private ButtonOff() {}

    public static ButtonOff getInstance(){//인스턴스로 반환
        return buttonOff;
    }

    public void on_botton_pushed(Light light){
        System.out.println("off상태에서 on");
        light.setState(ButtonOn.getInstance());//스테이트 패턴 상태변경 off-> on
    }

    public void off_botton_pushed(Light light){
        System.out.println("반응X");
    }
}


