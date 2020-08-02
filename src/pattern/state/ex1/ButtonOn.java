package pattern.state.ex1;

public class ButtonOn implements State{

    private static ButtonOn on = new ButtonOn();//인스턴스로 초기화

    private ButtonOn(){}


    public static ButtonOn getInstance(){//초기화된 인스턴스를 반환
        return on;
    }

    public void on_botton_pushed(Light light){
        System.out.println("반응없음");
    }

    public void off_botton_pushed(Light light){
        System.out.println("on에서 off로");
        light.setState(ButtonOff.getInstance());//스테이트 패턴 상태변경 on -> off
    }
}
