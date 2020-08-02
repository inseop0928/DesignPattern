package pattern.singleton.ex1;

public class PrinterApplication {

    private final static int threadCnt = 5;


    public static void main(String arg[]){
        UserThread[] userThreads = new UserThread[threadCnt];

        /*
            경합조건이 발생하여 각각에 인스턴스가  동작
            그래서 객체가 여러개가 생성될수 있다.
            경합조건 방지(Printer 클래스 참고)

            1. 정적변수 인스턴드 초기화  - private static Printer printer = new Printer();
            2. 인스턴드 만드는 메소드 동기화 처리 - public synchronized  static Printer getPrinter(){


         */

        for(int i = 0 ;i<userThreads.length;i++){

            userThreads[i] = new UserThread((i+1) + "- thread");
            userThreads[i].start();
        }

    }

}
