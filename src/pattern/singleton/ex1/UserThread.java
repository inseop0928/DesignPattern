package pattern.singleton.ex1;

public class UserThread extends Thread {

    private boolean solution = false;

    public UserThread(String name){
        super(name);
    }

    public void setSolution(Boolean solution){
        this.solution = solution;
    }

    public void run(){

        Printer printer  = Printer.getPrinter();

        printer.print(Thread.currentThread().getName() + " print using " + printer.toString() +".");
    }
}
